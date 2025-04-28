package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse6aTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;


@GlobalDto
public class Wse6aTGroup extends Wse6aTGroupSerialized { 
   
					private Wse6aT wse6aT = new Wse6aT();

						private char[] wse6aTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse6aTGroup
	**/
    public Wse6aTGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse6aT.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse6aT
	 *	@return wse6aT
	 */   
	 public Wse6aT getWse6aT() {
   	return wse6aT;
   }
   /**
	* 	Update Wse6aT with the passed value
	*   Corresponding COBOL Variable is WSE-6A-T
	*	@param value
	*/
   public void setWse6aT(char[] value) {
      wse6aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse6aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse6aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse6aT.begin,wse6aT.length());
   }
   
     /**
	 * 	Update Wse6aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse6aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse6aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse6aT with another Field
	 *	@param value
	 */
   public void setWse6aT(Field source) {
   	replace(source,0,source.length(),wse6aT.begin,wse6aT.length());
   }  
   
     /**
	 * 	Update Wse6aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse6aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse6aT.begin,wse6aT.length());
   }
   
     /**
	 * 	Update Wse6aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse6aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse6aT.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse6aTR
	 *	@return wse6aTR
	 */
   public char[] getWse6aTR() throws CFException{
     if (isWse6aTRModified()) { 
        wse6aTR = refreshWse6aTR();
     }
   		return wse6aTR;
   }

  
	/**
	*  set variable wse6aTR
	*  Corresponding COBOL Variable is WSE-6A-T-R
	*  @param value
	**/
   public void setWse6aTR(char[] value) {
      wse6aTR = checkWse6aTRConstraints(value);
      serializeWse6aTR(wse6aTR);
   } 

     /**
	 * 	Update Wse6aTR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse6aTR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse6aTR,wse6aTR.length);
   	
   }
   
   public void setWse6aTR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse6aTR,wse6aTR.length);
   	
   }
   
     /**
	 * 	Update Wse6aTR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse6aTR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse6aTR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse6aTR with another Field
	 *	@param value
	 */
   public void setWse6aTR(Field source) {
       replace(source,0,source.length(),beginWse6aTR,WSE_6A_TR_LEN);
   	
   }  
   
     /**
	 * 	Update Wse6aTR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse6aTR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse6aTR,WSE_6A_TR_LEN);
   	
   }
   
     /**
	 * 	Update Wse6aTR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse6aTR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse6aTR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse6aTGroupFieldLength() {
			return WSE_6A_TGROUP_LENGTH;
		}

}
  
