package com.example.bottomsheetbehavior

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class SampleBottomSheetBeheavierDialog : BottomSheetDialogFragment() {

    companion object {
        fun newInstance(): SampleBottomSheetBeheavierDialog? {
            return SampleBottomSheetBeheavierDialog()
        }
    }

    override fun getTheme(): Int {
        return R.style.AppBottomSheetDialogTheme
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.dialog_sample, container, false);
        return view
    }
}