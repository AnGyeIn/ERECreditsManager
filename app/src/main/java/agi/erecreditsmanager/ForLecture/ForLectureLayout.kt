package agi.erecreditsmanager.ForLecture

import agi.erecreditsmanager.R
import android.content.Context
import android.view.LayoutInflater
import android.widget.Button
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.forlecture.view.*

class ForLectureLayout(context : Context) : RelativeLayout(context) {
    init {
        LayoutInflater.from(context).run {
            inflate(R.layout.forlecture, this@ForLectureLayout, true)

            forLectureTextView
            deleteButton
        }
    }
}