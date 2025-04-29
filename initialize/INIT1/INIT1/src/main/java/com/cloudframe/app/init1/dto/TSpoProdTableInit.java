package com.cloudframe.app.init1.dto;

/**
*  The class TSpoProdTableInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class TSpoProdTableInit extends TSpoProdTableInitSerialized {
   







	
	/**
	* Constructor for TSpoProdTableInit
	**/
    public TSpoProdTableInit() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 0
             ,4
             );
       replaceValue(pad(8,"0L","0",LEFT_PAD),getStartOffset() + 4,8);
       replaceValue(pad(8,"0L","0",LEFT_PAD),getStartOffset() + 12,8);
       replaceValue(pad(8,"0L","0",LEFT_PAD),getStartOffset() + 20,8);
       replaceValue(pad(8,"0L","0",LEFT_PAD),getStartOffset() + 28,8);
       replaceValue(pad(8,"0L","0",LEFT_PAD),getStartOffset() + 36,8);
       replaceValue(pad(8,"0L","0",LEFT_PAD),getStartOffset() + 44,8);
    }





}
  
