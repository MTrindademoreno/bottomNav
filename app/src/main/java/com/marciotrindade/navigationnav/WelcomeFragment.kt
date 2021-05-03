package com.marciotrindade.navigationnav

import android.content.Context
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.marciotrindade.navigationnav.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment(R.layout.fragment_welcome) {


    private var fragmentWelcomeBinding: FragmentWelcomeBinding? = null

    val args: WelcomeFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentWelcomeBinding.bind(view)
        fragmentWelcomeBinding = binding

        binding.tvUserName.text = args.userName
        binding.tvPassword.text = args.password
    }

}