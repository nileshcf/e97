package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage1Ln6c is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HdPage1Ln6c extends HdPage1Ln6cSerialized {
   

						private char[] hd16cCc = new char[1];




						private char[] hd15SettIca = new char[6];

	
	/**
	* Constructor for HdPage1Ln6c
	**/
    public HdPage1Ln6c() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd16cCc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("SETTLEMENT ICA     :").toCharArray()
             , getStartOffset() + 2
             ,20
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 22
             ,1
             );
								setHd15SettIca(fillSpace(6));
       replaceValue( // serialize and save the value
             pad(104," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 29
             ,104
             );
    }


 

	/**
	 *	Returns the value of hd16cCc
	 *	@return hd16cCc
	 */
   public char[] getHd16cCc() throws CFException{
     if (isHd16cCcModified()) { 
        hd16cCc = refreshHd16cCc();
     }
   		return hd16cCc;
   }

  
	/**
	*  set variable hd16cCc
	*  Corresponding COBOL Variable is HD1-6C-CC
	*  @param value
	**/
   public void setHd16cCc(char[] value) {
      hd16cCc = checkHd16cCcConstraints(value);
      serializeHd16cCc(hd16cCc);
   } 

     /**
	 * 	Update Hd16cCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd16cCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd16cCc,hd16cCc.length);
   	
   }
   
   public void setHd16cCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd16cCc,hd16cCc.length);
   	
   }
   
     /**
	 * 	Update Hd16cCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd16cCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd16cCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd16cCc with another Field
	 *	@param value
	 */
   public void setHd16cCc(Field source) {
       replace(source,0,source.length(),beginHd16cCc,HD_16C_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Hd16cCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd16cCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd16cCc,HD_16C_CC_LEN);
   	
   }
   
     /**
	 * 	Update Hd16cCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd16cCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd16cCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hd15SettIca
	 *	@return hd15SettIca
	 */
   public char[] getHd15SettIca() throws CFException{
     if (isHd15SettIcaModified()) { 
        hd15SettIca = refreshHd15SettIca();
     }
   		return hd15SettIca;
   }

  
	/**
	*  set variable hd15SettIca
	*  Corresponding COBOL Variable is HD1-5-SETT-ICA
	*  @param value
	**/
   public void setHd15SettIca(char[] value) {
      hd15SettIca = checkHd15SettIcaConstraints(value);
      serializeHd15SettIca(hd15SettIca);
   } 

     /**
	 * 	Update Hd15SettIca 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd15SettIca(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd15SettIca,hd15SettIca.length);
   	
   }
   
   public void setHd15SettIca(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd15SettIca,hd15SettIca.length);
   	
   }
   
     /**
	 * 	Update Hd15SettIca 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd15SettIca(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd15SettIca+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd15SettIca with another Field
	 *	@param value
	 */
   public void setHd15SettIca(Field source) {
       replace(source,0,source.length(),beginHd15SettIca,HD_15_SETT_ICA_LEN);
   	
   }  
   
     /**
	 * 	Update Hd15SettIca 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd15SettIca(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd15SettIca,HD_15_SETT_ICA_LEN);
   	
   }
   
     /**
	 * 	Update Hd15SettIca 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd15SettIca(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd15SettIca+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHdPage1Ln6cFieldLength() {
			return HD_PAGE_1_LN_6C_LENGTH;
		}

}
  
