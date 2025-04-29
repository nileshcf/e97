package com.cloudframe.app.si994010.dto;

/**
*  The class Si520DeAndLengthsGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
**/


import com.cloudframe.app.si994010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Si520DeAndLengthsGroup extends Si520DeAndLengthsGroupSerialized {
   
					private Si520DeAndLengths si520DeAndLengths = new Si520DeAndLengths();
					private Si520DeAndLengthsRedefined si520DeAndLengthsRedefined = new Si520DeAndLengthsRedefined();
	
	/**
	* Constructor for Si520DeAndLengthsGroup
	**/
    public Si520DeAndLengthsGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			si520DeAndLengths.setParent(this,getStartOffset() + 0);
	       			si520DeAndLengthsRedefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of si520DeAndLengths
	 *	@return si520DeAndLengths
	 */   
	 public Si520DeAndLengths getSi520DeAndLengths() {
   	return si520DeAndLengths;
   }
   /**
	* 	Update Si520DeAndLengths with the passed value
	*   Corresponding COBOL Variable is SI520-DE-AND-LENGTHS
	*	@param value
	*/
   public void setSi520DeAndLengths(char[] value) {
      si520DeAndLengths.setString(value); 
   }   
    
     /**
	 * 	Update Si520DeAndLengths 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSi520DeAndLengths(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,si520DeAndLengths.begin,si520DeAndLengths.length());
   }
   
     /**
	 * 	Update Si520DeAndLengths 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi520DeAndLengths(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,si520DeAndLengths.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Si520DeAndLengths with another Field
	 *	@param value
	 */
   public void setSi520DeAndLengths(Field source) {
   	replace(source,0,source.length(),si520DeAndLengths.begin,si520DeAndLengths.length());
   }  
   
     /**
	 * 	Update Si520DeAndLengths 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSi520DeAndLengths(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,si520DeAndLengths.begin,si520DeAndLengths.length());
   }
   
     /**
	 * 	Update Si520DeAndLengths 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi520DeAndLengths(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,si520DeAndLengths.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of si520DeAndLengthsRedefined
	 *	@return si520DeAndLengthsRedefined
	 */   
	 public Si520DeAndLengthsRedefined getSi520DeAndLengthsRedefined() {
   	return si520DeAndLengthsRedefined;
   }
   /**
	* 	Update Si520DeAndLengthsRedefined with the passed value
	*   Corresponding COBOL Variable is SI520-DE-AND-LENGTHS-REDEFINED
	*	@param value
	*/
   public void setSi520DeAndLengthsRedefined(char[] value) {
      si520DeAndLengthsRedefined.setString(value); 
   }   
    
     /**
	 * 	Update Si520DeAndLengthsRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSi520DeAndLengthsRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,si520DeAndLengthsRedefined.begin,si520DeAndLengthsRedefined.length());
   }
   
     /**
	 * 	Update Si520DeAndLengthsRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi520DeAndLengthsRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,si520DeAndLengthsRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Si520DeAndLengthsRedefined with another Field
	 *	@param value
	 */
   public void setSi520DeAndLengthsRedefined(Field source) {
   	replace(source,0,source.length(),si520DeAndLengthsRedefined.begin,si520DeAndLengthsRedefined.length());
   }  
   
     /**
	 * 	Update Si520DeAndLengthsRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSi520DeAndLengthsRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,si520DeAndLengthsRedefined.begin,si520DeAndLengthsRedefined.length());
   }
   
     /**
	 * 	Update Si520DeAndLengthsRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi520DeAndLengthsRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,si520DeAndLengthsRedefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSi520DeAndLengthsGroupFieldLength() {
			return SI_520_DE_AND_LENGTHS_GROUP_LENGTH;
		}

}
  
