package com.cloudframe.app.init1.dto;

/**
*  The class KeyM2mPromo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class KeyM2mPromo extends KeyM2mPromoSerialized { 
   

								@Getter @Setter private int m2mCustIdNo;

								@Getter @Setter private int m2mAcctNo;
				@Getter @Setter private M2mMtn m2mMtn = new M2mMtn();
	
	/**
	* Constructor for KeyM2mPromo
	**/
    public KeyM2mPromo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for KeyM2mPromo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyM2mPromo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getM2mMtn().setParent(this,getStartOffset() + 8);
								setM2mCustIdNo(0);
								setM2mAcctNo(0);
    } 

	/**
	 * 	initializes KeyM2mPromo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setM2mCustIdNo(0);
                     setM2mAcctNo(0);
          getM2mMtn().initialize();
     
   }


}
  
