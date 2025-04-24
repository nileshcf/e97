package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse15aTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;


@GlobalDto
public class Wse15aTGroup extends Wse15aTGroupSerialized { 
   
					private Wse15aT wse15aT = new Wse15aT();

						private char[] wse15aTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse15aTGroup
	**/
    public Wse15aTGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse15aT.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse15aT
	 *	@return wse15aT
	 */   
	 public Wse15aT getWse15aT() {
   	return wse15aT;
   }
   /**
	* 	Update Wse15aT with the passed value
	*   Corresponding COBOL Variable is WSE-15A-T
	*	@param value
	*/
   public void setWse15aT(char[] value) {
      wse15aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse15aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse15aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse15aT.begin,wse15aT.length());
   }
   
     /**
	 * 	Update Wse15aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse15aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse15aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse15aT with another Field
	 *	@param value
	 */
   public void setWse15aT(Field source) {
   	replace(source,0,source.length(),wse15aT.begin,wse15aT.length());
   }  
   
     /**
	 * 	Update Wse15aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse15aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse15aT.begin,wse15aT.length());
   }
   
     /**
	 * 	Update Wse15aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse15aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse15aT.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse15aTR
	 *	@return wse15aTR
	 */
   public char[] getWse15aTR() throws CFException{
     if (isWse15aTRModified()) { 
        wse15aTR = refreshWse15aTR();
     }
   		return wse15aTR;
   }

  
	/**
	*  set variable wse15aTR
	*  Corresponding COBOL Variable is WSE-15A-T-R
	*  @param value
	**/
   public void setWse15aTR(char[] value) {
      wse15aTR = checkWse15aTRConstraints(value);
      serializeWse15aTR(wse15aTR);
   } 

     /**
	 * 	Update Wse15aTR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse15aTR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse15aTR,wse15aTR.length);
   	
   }
   
   public void setWse15aTR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse15aTR,wse15aTR.length);
   	
   }
   
     /**
	 * 	Update Wse15aTR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse15aTR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse15aTR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse15aTR with another Field
	 *	@param value
	 */
   public void setWse15aTR(Field source) {
       replace(source,0,source.length(),beginWse15aTR,WSE_15A_TR_LEN);
   	
   }  
   
     /**
	 * 	Update Wse15aTR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse15aTR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse15aTR,WSE_15A_TR_LEN);
   	
   }
   
     /**
	 * 	Update Wse15aTR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse15aTR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse15aTR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse15aTGroupFieldLength() {
			return WSE_15A_TGROUP_LENGTH;
		}

}
  
