package com.cloudframe.app.init1.dto;

/**
*  The class KeyUsgPrev is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class KeyUsgPrev extends KeyUsgPrevSerialized { 
   

								@Getter @Setter private int usgPrvCustIdNo;

								@Getter @Setter private int usgPrvAcctNo;
				@Getter @Setter private UsgPrvMtn usgPrvMtn = new UsgPrvMtn();

								@Getter @Setter private long usgPrvInvoiceNo;

						@Getter @Setter private char[] usgPrvItuMobCountryCd = new char[3];

						@Getter @Setter private char[] usgPrvItuMobNetworkCd = new char[3];

						@Getter @Setter private char[] usgPrvBeginDt = new char[10];

						@Getter @Setter private char[] usgPrvBeginTm = new char[8];

						@Getter @Setter private char[] usgPrvGri = new char[40];
	
	/**
	* Constructor for KeyUsgPrev
	**/
    public KeyUsgPrev() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for KeyUsgPrev. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyUsgPrev(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getUsgPrvMtn().setParent(this,getStartOffset() + 8);
								setUsgPrvCustIdNo(0);
								setUsgPrvAcctNo(0);
								setUsgPrvInvoiceNo(0L);
								setUsgPrvItuMobCountryCd(fillSpace(3));
								setUsgPrvItuMobNetworkCd(fillSpace(3));
								setUsgPrvBeginDt(fillSpace(10));
								setUsgPrvBeginTm(fillSpace(8));
								setUsgPrvGri(fillSpace(40));
    } 

	/**
	 * 	initializes KeyUsgPrev
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setUsgPrvCustIdNo(0);
                     setUsgPrvAcctNo(0);
          getUsgPrvMtn().initialize();
     
                     setUsgPrvInvoiceNo(0);
         setUsgPrvItuMobCountryCd(CONSTANTS.SPACE_3);
         setUsgPrvItuMobNetworkCd(CONSTANTS.SPACE_3);
         setUsgPrvBeginDt(CONSTANTS.SPACE_10);
         setUsgPrvBeginTm(CONSTANTS.SPACE_8);
         setUsgPrvGri(CONSTANTS.SPACE_40);
   }


}
  
