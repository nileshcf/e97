package com.cloudframe.app.gp004760.dto;

/**
*  The class Tgpaitb is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/


import com.cloudframe.app.gp004760.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Tgpaitb extends TgpaitbSerialized {
   

								private int tgpaitbCabCd;

						private char[] tgpaitbAuthTxnCatCd = Field.fillLowValue(1);
	
	/**
	* Constructor for Tgpaitb
	**/
    public Tgpaitb() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	public int getTgpaitbCabCd() throws CFException {
        if (isTgpaitbCabCdModified()) { 
           tgpaitbCabCd = refreshTgpaitbCabCd();
        }
   		return tgpaitbCabCd;
	}
	
	/**
	 * 	Update TgpaitbCabCd with the passed value
	 *  Corresponding COBOL Variable is TGPAITB-CAB-CD
	 *	@param number
	 */
	public void setTgpaitbCabCd(int number) {
			tgpaitbCabCd = checkTgpaitbCabCdMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTgpaitbCabCd(tgpaitbCabCd);
	}


	public void setTgpaitbCabCd(long number) {
	    number = checkTgpaitbCabCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTgpaitbCabCd((int)number);
	}
	
	/**
	 *	Returns the value of tgpaitbAuthTxnCatCd
	 *	@return tgpaitbAuthTxnCatCd
	 */
   public char[] getTgpaitbAuthTxnCatCd() throws CFException{
     if (isTgpaitbAuthTxnCatCdModified()) { 
        tgpaitbAuthTxnCatCd = refreshTgpaitbAuthTxnCatCd();
     }
   		return tgpaitbAuthTxnCatCd;
   }

  
	/**
	*  set variable tgpaitbAuthTxnCatCd
	*  Corresponding COBOL Variable is TGPAITB-AUTH-TXN-CAT-CD
	*  @param value
	**/
   public void setTgpaitbAuthTxnCatCd(char[] value) {
      tgpaitbAuthTxnCatCd = checkTgpaitbAuthTxnCatCdConstraints(value);
      serializeTgpaitbAuthTxnCatCd(tgpaitbAuthTxnCatCd);
   } 

     /**
	 * 	Update TgpaitbAuthTxnCatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgpaitbAuthTxnCatCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTgpaitbAuthTxnCatCd,tgpaitbAuthTxnCatCd.length);
   	
   }
   
   public void setTgpaitbAuthTxnCatCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTgpaitbAuthTxnCatCd,tgpaitbAuthTxnCatCd.length);
   	
   }
   
     /**
	 * 	Update TgpaitbAuthTxnCatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgpaitbAuthTxnCatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTgpaitbAuthTxnCatCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TgpaitbAuthTxnCatCd with another Field
	 *	@param value
	 */
   public void setTgpaitbAuthTxnCatCd(Field source) {
       replace(source,0,source.length(),beginTgpaitbAuthTxnCatCd,TGPAITB_AUTH_TXN_CAT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TgpaitbAuthTxnCatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgpaitbAuthTxnCatCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTgpaitbAuthTxnCatCd,TGPAITB_AUTH_TXN_CAT_CD_LEN);
   	
   }
   
     /**
	 * 	Update TgpaitbAuthTxnCatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgpaitbAuthTxnCatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTgpaitbAuthTxnCatCd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTgpaitbFieldLength() {
			return TGPAITB_LENGTH;
		}

}
  
