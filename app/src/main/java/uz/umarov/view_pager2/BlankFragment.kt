package uz.umarov.view_pager2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import uz.umarov.view_pager2.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {

    private var image: Int? = null
    private var head: String? = null
    private var message: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            image = it.getInt("image")
            head = it.getString("header")
            message = it.getString("message")

        }
    }

    private lateinit var binding: FragmentBlankBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBlankBinding.inflate(layoutInflater)

        binding.imageOfView.setImageResource(image!!)
        binding.headerTitle.text = head

        binding.messageTxt.text = message
        return binding.root
    }

    companion object {

        fun newInstance(image: Int, head: String, message: String) =
            BlankFragment().apply {
                arguments = Bundle().apply {
                    putInt("image", image)
                    putString("header", head)
                    putString("message", message)
                }
            }
    }
}