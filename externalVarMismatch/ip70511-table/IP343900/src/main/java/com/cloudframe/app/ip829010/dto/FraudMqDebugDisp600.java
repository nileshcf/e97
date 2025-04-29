package com.cloudframe.app.ip829010.dto;

/**
*  The class FraudMqDebugDisp600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class FraudMqDebugDisp600 extends FraudMqDebugDisp600Serialized {
   

						@Getter @Setter private char[] primaryAcctNo600 = new char[19];

						@Getter @Setter private char[] expirDate600 = new char[6];

						@Getter @Setter private char[] virtualAcctNo600 = new char[19];

								@Getter @Setter private int queryNum600;

						@Getter @Setter private char[] gftDsn600 = new char[44];

								@Getter @Setter private long logicalSeq600;

								@Getter @Setter private long txnNo600;

								@Getter @Setter private long facCount600;

						@Getter @Setter private char[] faaPanStatCd600 = new char[1];

						@Getter @Setter private char[] faaClsDt600 = new char[10];
	
	/**
	* Constructor for FraudMqDebugDisp600
	**/
    public FraudMqDebugDisp600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPrimaryAcctNo600(fillSpace(19));
								setExpirDate600(fillSpace(6));
								setVirtualAcctNo600(fillSpace(19));
								setQueryNum600(0);
								setGftDsn600(fillSpace(44));
								setLogicalSeq600(0L);
								setTxnNo600(0L);
								setFacCount600(0L);
								setFaaPanStatCd600("0".toCharArray());
								setFaaClsDt600("0000000000".toCharArray());
    }



	/**
	 * 	initializes FraudMqDebugDisp600
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setPrimaryAcctNo600(CONSTANTS.SPACE_19);
         setExpirDate600(CONSTANTS.SPACE_6);
         setVirtualAcctNo600(CONSTANTS.SPACE_19);
                     setQueryNum600(0);
         setGftDsn600(CONSTANTS.SPACE_44);
                     setLogicalSeq600(0);
                     setTxnNo600(0);
                     setFacCount600(0);
         setFaaPanStatCd600(CONSTANTS.SPACE);
         setFaaClsDt600(CONSTANTS.SPACE_10);
   }


}
  
