package uz.umarov.view_pager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.umarov.view_pager2.adapters.MyFragment
import uz.umarov.view_pager2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        supportActionBar?.hide()
        binding.viewPager.adapter = MyFragment(supportFragmentManager)


        binding.dotsIndicator.setViewPager(binding.viewPager)

    }
}