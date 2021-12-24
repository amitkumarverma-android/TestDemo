package com.mmi.testdemo

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mmi.common.network.NetworkStatus
import com.mmi.core.coreComponent


import com.mmi.presentation.models.MatchResponse
import com.mmi.presentation.utils.Utilities.getCurrentDate
import com.mmi.presentation.utils.Utilities.hasInternetConnection
import com.mmi.presentation.viewmodels.CompetitionsViewModel

import com.mmi.testdemo.databinding.FragmentTodayFixturesBinding
import com.mmi.testdemo.di.DaggerAppComponent
import javax.inject.Inject


class TodayFixturesFragment : Fragment() {
    lateinit var binding: FragmentTodayFixturesBinding
    private lateinit var adapter: TodayFixturesAdapter

    @Inject
    lateinit var factory: ViewModelProvider.Factory
    private val viewModel: CompetitionsViewModel by viewModels { factory }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        DaggerAppComponent.factory().create(coreComponent()).inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_today_fixtures, container, false)
        val view = binding.root

        initRecyclerView()

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getTodayMatch(getCurrentDate())
    }

    private fun initRecyclerView() {
        adapter = TodayFixturesAdapter(ArrayList())
        binding.fixturesRecyclerview.adapter = adapter
        binding.fixturesRecyclerview.layoutManager =
            LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
        binding.fixturesRecyclerview.addItemDecoration(
            DividerItemDecoration(
                context,
                LinearLayoutManager.VERTICAL
            )
        )
    }

    /**
     * Fetch list of all matches for today
     */
    private fun getTodayMatch(date: String) {
        if (hasInternetConnection(requireContext()))
            viewModel.getAllMatches(date).observe(viewLifecycleOwner, { result ->
                when (result) {
                    is NetworkStatus.Loading -> {
                        showLoading()
                    }
                    is NetworkStatus.Error -> {
                        hideLoading()
                        getTodayMatchFailed(result.errorMessage!!)
                    }
                    is NetworkStatus.Success -> {
                        hideLoading()
                        result.data?.let { getTodayMatchSuccessful(it) }
                    }
                }
            })
        else {
            showNoInternet()
        }
    }

    private fun getTodayMatchSuccessful(matchResponse: MatchResponse) {
        if (matchResponse.matches.isNotEmpty()) {
            adapter.updateAdapter(matchResponse.matches)
        } else {
            binding.noFixture.visibility = View.VISIBLE
        }
    }

    private fun getTodayMatchFailed(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }

    private fun showNoInternet() {
        binding.fixturesRecyclerview.visibility = View.GONE
        binding.noInternet.visibility = View.VISIBLE
    }

     private fun showLoading() {
        binding.includeProgressBar.visibility = View.VISIBLE
    }

     private fun hideLoading() {
        binding.includeProgressBar.visibility = View.GONE
    }

    companion object {
        @JvmStatic
        fun newInstance() = TodayFixturesFragment()
    }
}