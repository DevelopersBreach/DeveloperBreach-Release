package com.developerbreach.developerbreach.view.favorites

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.developerbreach.developerbreach.databinding.FragmentFavoritesBinding
import com.developerbreach.developerbreach.utils.RecyclerViewItemDecoration.Companion.setItemSpacing
import java.util.concurrent.TimeUnit

class FavoritesFragment : Fragment() {

    private lateinit var binding: FragmentFavoritesBinding
    private lateinit var viewModel: FavoritesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Get application context for this class for factory to create instance of ViewModel.
        val application = requireActivity().application
        // Call factory for creating new instance of ViewModel for this fragment to observe data.
        // Pass application context to the factory.
        val factory = FavoritesViewModelFactory(application)
        // Assign and get class ViewModel and pass fragment owner and factory to create instance
        // by calling ViewModelProviders.
        viewModel = ViewModelProvider(this, factory)[FavoritesViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Get reference to binding and inflate this class layout.
        binding = FragmentFavoritesBinding.inflate(inflater)
        // Set item decoration for items inside recycler view.
        setItemSpacing(resources, binding.favoritesRecyclerView)
        // Time taken for fragment to enter with transition
        postponeEnterTransition(300L, TimeUnit.MILLISECONDS)
        binding.lifecycleOwner = this
        // Allows Data Binding to Observe LiveData with the lifecycle of this Fragment.
        binding.viewModel = viewModel
        binding.navController = findNavController()
        binding.executePendingBindings()
        // Return root binding view.
        return binding.root
    }
}
