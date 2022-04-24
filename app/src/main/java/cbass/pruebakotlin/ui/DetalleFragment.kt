package cbass.pruebakotlin.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import cbass.pruebakotlin.R
import cbass.pruebakotlin.databinding.FragmentDetalleBinding
import cbass.pruebakotlin.viewmodel.CryptoVM

class DetalleFragment : Fragment() {

    lateinit var binding: FragmentDetalleBinding
    private val viewModel by activityViewModels<CryptoVM>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetalleBinding.inflate(layoutInflater)
        return binding.root
    }

}