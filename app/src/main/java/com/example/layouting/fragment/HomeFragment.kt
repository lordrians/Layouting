package com.example.layouting.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.layouting.DetailActivity
import com.example.layouting.ListMovieActivity
import com.example.layouting.SecondActivity
import com.example.layouting.databinding.FragmentHomeBinding
import com.example.layouting.dtMovie

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListener()
    }
    private fun setupListener() {
        with(binding){
            btnListMovie.setOnClickListener {
                val intent = Intent(requireContext(), ListMovieActivity::class.java)
                startActivity(intent)
            }

            btnDetailMovie.setOnClickListener {
                val movie = dtMovie().getMovie()[0]
                val intent = Intent(requireContext(), DetailActivity::class.java)
                intent.putExtra("movie_data", movie)
                startActivity(intent)
            }

            btnSecondActivity.setOnClickListener {
                startActivity(Intent(requireContext(), SecondActivity::class.java))
            }

            btnBrowser.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW)
                val uriData = Uri.parse("https://developer.android.com/jetpack?gclid=Cj0KCQjw6pOTBhCTARIsAHF23fK70_cAUpbMayYe8pP5_LvKYoJ7jCXKilzibfhsydQWFQH7vd3g4lEaAiF4EALw_wcB&gclsrc=aw.ds")
                intent.data = uriData
                startActivity(intent)
            }

            btnDialPhone.setOnClickListener {
                val intent = Intent(Intent.ACTION_DIAL)
                val uriData = Uri.parse("tel:(+62)12345789")
                intent.data = uriData
                startActivity(intent)

            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}