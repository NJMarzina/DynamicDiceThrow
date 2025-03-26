package edu.temple.dicethrow

import android.os.Bundle
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import edu.temple.dicethrow.ButtonFragment
import edu.temple.dicethrow.DieFragment

class MainActivity : AppCompatActivity(), ButtonFragment.ButtonInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
            if (savedInstanceState == null) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container2, ButtonFragment())
                    .commit()

                supportFragmentManager.beginTransaction()
                    .replace(R.id.container1, DieFragment())
                    .commit()
            }
        } else {
            if (savedInstanceState == null) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container2, ButtonFragment())
                    .commit()

                supportFragmentManager.beginTransaction()
                    .replace(R.id.container1, DieFragment())
                    .commit()
            }
        }
    }

    override fun buttonClicked() {

    }
}
