package uz.umarov.view_pager2.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import uz.umarov.view_pager2.BlankFragment
import uz.umarov.view_pager2.R

class MyFragment(fragmentManager: FragmentManager) :
    FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int = 4

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                BlankFragment.newInstance(
                    R.drawable.img1,
                    "Geoaxborot",
                    "Geoaxborot desc"
                )
            }
            1 -> {
                BlankFragment.newInstance(
                    R.drawable.img2,
                    "Huquqiy axborot",
                    "Huquqiy axborot desc"
                )
            }
            2 -> {
                BlankFragment.newInstance(
                    R.drawable.img3,
                    "To'lov xizmatlari",
                    "To'lov xizmatlari desc"
                )
            }
            else -> {
                BlankFragment.newInstance(
                    R.drawable.img4,
                    "Qo'shimcha imkoniyat",
                    "Qo'shimcha imkoniyat desc"
                )
            }
        }
    }
}