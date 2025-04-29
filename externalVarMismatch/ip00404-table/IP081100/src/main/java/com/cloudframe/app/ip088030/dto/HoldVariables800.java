package com.cloudframe.app.ip088030.dto;

/**
*  The class HoldVariables800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class HoldVariables800 extends HoldVariables800Serialized {
   

						@Getter @Setter private char[] fundPan800 = new char[10];

						@Getter @Setter private char[] mccCode800 = new char[4];

						@Getter @Setter private char[] prodId800 = new char[3];

						@Getter @Setter private char[] fundProdId800 = new char[3];

						@Getter @Setter private char[] mccCodeX800 = new char[4];

						@Getter @Setter private char[] maid800 = new char[6];
	
	/**
	* Constructor for HoldVariables800
	**/
    public HoldVariables800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setFundPan800(fillSpace(10));
								setMccCode800(fillSpace(4));
								setProdId800(fillSpace(3));
								setFundProdId800(fillSpace(3));
								setMccCodeX800(fillSpace(4));
								setMaid800(fillSpace(6));
    }





}
  
