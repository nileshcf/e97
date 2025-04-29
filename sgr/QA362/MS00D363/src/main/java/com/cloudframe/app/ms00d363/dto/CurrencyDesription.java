package com.cloudframe.app.ms00d363.dto;

/**
*  The class CurrencyDesription is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class CurrencyDesription extends CurrencyDesriptionSerialized {
   
				@Getter @Setter private CurrDescXds currDescXds = new CurrDescXds();
				@Getter @Setter private CurrDescBat currDescBat = new CurrDescBat();
	
	/**
	* Constructor for CurrencyDesription
	**/
    public CurrencyDesription() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getCurrDescXds().setParent(this,getStartOffset() + 0);
					getCurrDescBat().setParent(this,getStartOffset() + 108);
	   	/*  end of offset */
    }





}
  
