package com.ctt.whatzap

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    //Equivalente ao ItemCount da RV
    //Numero de FRAGMENTS a serem colocadas
    override fun getCount(): Int {
        return 3
    }

    //Relação entre ITEM/POSIÇÃO a FRAGMENT a ser exibida
    override fun getItem(position: Int): Fragment {
        return when(position){
            //CONVERSAS
            0 -> ContatosFragment()
            1 -> ContatosFragment()
            2 -> ContatosFragment()
            else -> ContatosFragment()
        }
    }

    //NÃO OBRIGATÓRIOO!!! PRECISA IMPLEMENTAR MANUALMENTE
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Conversas"
            1 -> "Status"
            2 -> "Chamadas"
            else -> super.getPageTitle(position)
        }
    }
}