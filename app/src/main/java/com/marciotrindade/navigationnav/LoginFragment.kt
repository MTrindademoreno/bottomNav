package com.marciotrindade.navigationnav

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.marciotrindade.navigationnav.databinding.FragmentLoginBinding

class LoginFragment : Fragment(R.layout.fragment_login) {
    private var fragmentLoginBinding:FragmentLoginBinding?=null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentLoginBinding.bind(view)
        fragmentLoginBinding = binding
        binding.btnConfirm.setOnClickListener {
            val userName= binding.editUserName.editableText.toString()
            val password = binding.editPassword.editableText.toString()
            //todo verificar os argumentos para a action abaixo e safe args
            val action =LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(userName, password)
            findNavController().navigate(action)
        }
    }
}