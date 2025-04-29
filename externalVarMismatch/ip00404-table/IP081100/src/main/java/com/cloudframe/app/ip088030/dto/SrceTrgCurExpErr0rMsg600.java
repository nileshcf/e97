package com.cloudframe.app.ip088030.dto;

/**
*  The class SrceTrgCurExpErr0rMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class SrceTrgCurExpErr0rMsg600 extends SrceTrgCurExpErr0rMsg600Serialized {
   



						@Getter @Setter private char[] srceCurrValue600 = new char[3];


						@Getter @Setter private char[] srceExpValue600 = new char[1];



						@Getter @Setter private char[] trgCurrValue600 = new char[3];


						@Getter @Setter private char[] trgExpValue600 = new char[1];
	
	/**
	* Constructor for SrceTrgCurExpErr0rMsg600
	**/
    public SrceTrgCurExpErr0rMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("CURRENCY CONV FAILED.").toCharArray()
             , getStartOffset() + 0
             ,21
             );
       replaceValue( // serialize and save the value
             ("SRC-CUR:").toCharArray()
             , getStartOffset() + 21
             ,8
             );
								setSrceCurrValue600(fillSpace(3));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 32
             ,1
             );
								setSrceExpValue600(fillSpace(1));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 34
             ,1
             );
       replaceValue( // serialize and save the value
             ("TRG-CUR:").toCharArray()
             , getStartOffset() + 35
             ,8
             );
								setTrgCurrValue600(fillSpace(3));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 46
             ,1
             );
								setTrgExpValue600(fillSpace(1));
    }





}
  
