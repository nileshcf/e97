package com.cloudframe.app.o529351u.dto;

/**
*  The class W02FnuLineReadnext is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class W02FnuLineReadnext extends W02FnuLineReadnextSerialized {
   

						@Getter @Setter private char[] w02FnuTranRdnxt = new char[4];


						@Getter @Setter private char[] w02FnuFileRdnxt = Field.fillLowValue(8);


						@Getter @Setter private char[] w02FnuKeyRdnxt = Field.fillLowValue(38);
	
	/**
	* Constructor for W02FnuLineReadnext
	**/
    public W02FnuLineReadnext() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setW02FnuTranRdnxt(("BTMQ").toCharArray());
       replaceValue( // serialize and save the value
             (":RDNXT FAILED IN ").toCharArray()
             , getStartOffset() + 4
             ,17
             );
       replaceValue( // serialize and save the value
             (",KEY= ").toCharArray()
             , getStartOffset() + 29
             ,6
             );
    }





}
  
