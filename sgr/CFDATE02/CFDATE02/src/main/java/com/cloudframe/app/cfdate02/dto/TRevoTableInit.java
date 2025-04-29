package com.cloudframe.app.cfdate02.dto;

/**
*  The class TRevoTableInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;


@Data
public class TRevoTableInit extends TRevoTableInitSerialized {
   




	
	/**
	* Constructor for TRevoTableInit
	**/
    public TRevoTableInit() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 0
             ,3
             );
       replaceValue( // serialize and save the value
             fillSpace(40)
             , getStartOffset() + 3
             ,40
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 43
             ,4
             );
       replace( // serialize and save the value
             getPackedString(BigDecimal.ZERO,10,11,true)
             , 47
             ,10
             );
    }





}
  
