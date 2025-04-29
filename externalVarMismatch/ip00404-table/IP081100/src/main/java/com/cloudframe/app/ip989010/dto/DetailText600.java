package com.cloudframe.app.ip989010.dto;

/**
*  The class DetailText600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.utility.CFUtil;


@Data
public class DetailText600 extends DetailText600Serialized {
   

						@Getter @Setter private char[] panAlias600 = new char[36];


								@Getter @Setter private char[] donationLimt600 = new char[10];
							


								@Getter @Setter private char[] calcDonationAmt600 = new char[10];
							


								@Getter @Setter private char[] bultDonationAmt600 = new char[15];
							
	
	/**
	* Constructor for DetailText600
	**/
    public DetailText600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPanAlias600(fillSpace(36));
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 36
             ,5
             );
								setDonationLimt600(CFUtil.cobolNumberFormatter("ZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
       replaceValue( // serialize and save the value
             fillSpace(14)
             , getStartOffset() + 51
             ,14
             );
								setCalcDonationAmt600(CFUtil.cobolNumberFormatter("ZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
       replaceValue( // serialize and save the value
             fillSpace(9)
             , getStartOffset() + 75
             ,9
             );
								setBultDonationAmt600(CFUtil.cobolNumberFormatter("ZZZ,ZZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }





}
  
