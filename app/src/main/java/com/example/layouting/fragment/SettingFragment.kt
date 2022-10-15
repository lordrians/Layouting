package com.example.layouting.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.layouting.SHARED_PREF_MAJOR
import com.example.layouting.SHARED_PREF_NAME
import com.example.layouting.SHARED_PREF_SEMESTER
import com.example.layouting.databinding.FragmentSettingBinding
import com.example.layouting.setDefaultEmpty

class SettingFragment : Fragment() {

    private var _binding: FragmentSettingBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("qwer", "onCreateView: SettingFragment")
        _binding = FragmentSettingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("qwer", "onCreate: SettingFragment")

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("qwer", "onViewCreated: SettingFragment")
        setupListener()
    }

    private fun setupListener() {
        with(binding){
            btnSave.setOnClickListener {
                val name = etName.text.toString().setDefaultEmpty("Data Kosong")
                val major = etMajor.text.toString().setDefaultEmpty("Data Kosong")
                val semester = etSemester.text.toString().setDefaultEmpty("Data Kosong")

                saveToSharedPref(name, major, semester)

                etName.setText("")
                etMajor.setText("")
                etSemester.setText("")

                Toast.makeText(requireActivity(), "Data Berhasil Disimpan", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun saveToSharedPref(name: String, major: String, semester: String) {
        val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE) ?: return
        with (sharedPref.edit()) {
            putString(SHARED_PREF_NAME, name)
            putString(SHARED_PREF_MAJOR, major)
            putString(SHARED_PREF_SEMESTER, semester)
            apply()
        }
    }



    override fun onStart() {
        super.onStart()
        Log.d("qwer", "onStart: SettingFragment")
    }

    override fun onResume() {
        super.onResume()
        Log.d("qwer", "onResume: SettingFragment")
    }

    override fun onPause() {
        super.onPause()
        Log.d("qwer", "onResume: SettingFragment")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("qwer", "onDestroy: SettingFragment")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("qwer", "onAttach: SettingFragment")
    }
    override fun onStop() {
        super.onStop()
        Log.d("qwer", "onStop: SettingFragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("qwer", "onDestroyView: SettingFragment")
        _binding = null
    }
}