package sudipta.`in`.toasty

import android.content.Context
import android.widget.Toast

class Toaster {
    fun simpleToast(context: Context, msg: String){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}