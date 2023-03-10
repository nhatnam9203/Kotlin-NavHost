package com.example.navhost

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.navhost.databinding.ActivityMainBinding
import com.example.navhost.databinding.FragmentDataBinding
import com.example.navhost.databinding.FragmentHomeBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : BaseFragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var binding: FragmentHomeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

        val args = getArguments()?.getString("data1")
        if (args != null) {
            Log.d("LOG_DATA_FRAGMENT",args )
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.btnLinkHomeFragment.setOnClickListener {
//            findNavController().navigate(R.id.dataFragment)

//            val transaction =  requireActivity().supportFragmentManager.beginTransaction()
//            transaction.addToBackStack(null)
//            transaction.replace(R.id.singleFragment, DataFragment.newInstance("test",""))
//            transaction.commit()

        }

        binding.btnShowBottomSheet.setOnClickListener {
            showMakeToast()
//            showBottomSheet()
        }

        return binding.getRoot();
    }

    private fun showBottomSheet(){
        val bottomSheet = BottomSheetDialog(requireContext())
        val view = layoutInflater.inflate(R.layout.bottom_sheet_dialog_layout,null)
        val btnClose = view.findViewById<Button>(R.id.btnCloseBottomSheet)

        btnClose.setOnClickListener {
            bottomSheet.dismiss()
        }

        bottomSheet.setCancelable(true)
        bottomSheet.setContentView(view)

        bottomSheet.show()
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}