package com.cloudframe.app.xmlpars2.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:45. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] elemNm = new char[20];

						@Getter @Setter private char[] attrNm = new char[20];

								@Getter @Setter private short elemLen;

								@Getter @Setter private short attrLen;

								@Getter @Setter private int i;

						@Getter @Setter private char[] vXml = new char[478];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setElemNm(fillSpace(20));
								setAttrNm(fillSpace(20));
								setElemLen((short)0);
								setAttrLen((short)0);
								setI(0);
								setVXml("<?xml version=\"1.0\" encoding=\"UTF-8\"?><EDR_CPF><CLIENT_ID>VISION</CLIENT_ID><TR_COUNT>1</TR_COUNT><BILLING_SYSTEM_ID>2</BILLING_SYSTEM_ID><TRAN_ID>20180130052423461412</TRAN_ID><REFRESH><TR_POPKEY><TR_TYPE>REFRESH</TR_TYPE><TR_TIME>2018-01-30-05.24.15.503368</TR_TIME><TR_FULFILLMENT_TIME>2018-01-30-05.24.15.503368</TR_FULFILLMENT_TIME><TR_MDN>7024193433</TR_MDN><TR_ACCOUNT_NUMBER>0</TR_ACCOUNT_NUMBER><TR_CUSTOMER_ID>203082888</TR_CUSTOMER_ID></TR_POPKEY></REFRESH></EDR_CPF>".toCharArray());
    }





}
  
