package com.cloudframe.app.ip809050.dto;

/**
*  The class ChipLiabVariables800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ChipLiabVariables800 extends ChipLiabVariables800Serialized {
   

						@Getter @Setter private char[] txnPrimAcctNbr800 = new char[19];


						@Getter @Setter private char[] sndrMbrId800 = new char[11];


						@Getter @Setter private char[] custName800 = new char[30];


						@Getter @Setter private char[] countryCode800 = new char[3];


						@Getter @Setter private char[] region800 = new char[10];


						@Getter @Setter private char[] errorNum800 = new char[4];


						@Getter @Setter private char[] editNum800 = new char[4];

				@Getter @Setter private ErrorDesc800 errorDesc800 = new ErrorDesc800();

				@Getter @Setter private De0311800 de0311800 = new De0311800();

				@Getter @Setter private CbhRefNum1800 cbhRefNum1800 = new CbhRefNum1800();


						@Getter @Setter private char[] cbhDate800 = new char[8];

				@Getter @Setter private De0221800 de0221800 = new De0221800();

				@Getter @Setter private TxnAmt1800 txnAmt1800 = new TxnAmt1800();


						@Getter @Setter private char[] txnCurr800 = new char[3];

				@Getter @Setter private UsdAmt1800 usdAmt1800 = new UsdAmt1800();

	
	/**
	* Constructor for ChipLiabVariables800
	**/
    public ChipLiabVariables800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getErrorDesc800().setParent(this,getStartOffset() + 88);
					getDe0311800().setParent(this,getStartOffset() + 295);
					getCbhRefNum1800().setParent(this,getStartOffset() + 321);
					getDe0221800().setParent(this,getStartOffset() + 343);
					getTxnAmt1800().setParent(this,getStartOffset() + 358);
					getUsdAmt1800().setParent(this,getStartOffset() + 376);
	   	/*  end of offset */
								setTxnPrimAcctNbr800("0000000000000000000".toCharArray());
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 19
             ,1
             );
								setSndrMbrId800("00000000000".toCharArray());
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 31
             ,1
             );
								setCustName800(fillSpace(30));
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 62
             ,1
             );
								setCountryCode800(fillSpace(3));
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 66
             ,1
             );
								setRegion800(fillSpace(10));
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 77
             ,1
             );
								setErrorNum800("0000".toCharArray());
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 82
             ,1
             );
								setEditNum800("0000".toCharArray());
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 87
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 294
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 320
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 333
             ,1
             );
								setCbhDate800(fillSpace(8));
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 342
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 357
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 371
             ,1
             );
								setTxnCurr800("000".toCharArray());
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 375
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 389
             ,1
             );
    }





}
  
