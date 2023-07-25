package com.example.libralink2.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.libralink2.LibraLinkApplication
import com.example.libralink2.database.User
import com.example.libralink2.databinding.FragmentListsBinding
import com.example.libralink2.databinding.FragmentLoginBinding
import com.example.libralink2.viewmodels.ProfileViewModel
import com.example.libralink2.viewmodels.ProfileViewModelFactory

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

//    private val profileViewModel: ProfileViewModel by activityViewModels {
//        ProfileViewModelFactory(
//            (activity?.application as LibraLinkApplication).database
//                .userDao()
//        )
//    }
//
//    lateinit var user: User

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

//    }
//    private var password= ""
//    private var email = ""
//
//    private fun validateData() {
//        email= binding.emailEt.text.toString()
//        password = binding.passwordEt.text.toString()
//
//        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
//            Toast.makeText(this, "Invalid email format", Toast.LENGTH_SHORT).show()
//        }
//        else if (password.isEmpty()){
//            Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show()
//        }
//        else
//            loginUser()
//    }
//
//    private fun loginUser() {
//        progressDialog.setMessage("Logging In...")
//        progressDialog.show()
//
//        firebaseAuth.signInWithEmailAndPassword(email,password)
//            .addOnSuccessListener {
//                checkUser()
//            }
//            .addOnFailureListener { e->
//                progressDialog.dismiss()
//                Toast.makeText(this, "Kogin failed due to ${e.message}", Toast.LENGTH_SHORT).show()
//            }
//    }
//
//    private fun checkUser() {
//        progressDialog.setMessage("CheckingUser...")
//        val firebaseUser = firebaseAuth.currentUser!!
//
//        val ref = FirebaseDatabase.getInstance().getReference("User")
//        val uid = firebaseAuth.uid
//        ref.child(firebaseUser.toString())
//            .addListenerForSingleValueEvent(object : ValueEventListener{
//                override fun onCancelled(error: DatabaseError) {
//                    progressDialog.dismiss()
//                    startActivity(Intent(this@LoginActivity, MainActivity::class.java))
//                }
//
//                override fun onDataChange(snapshot: DataSnapshot) {
//
//
//                }
//            })
//    }
}