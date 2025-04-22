package com.cloudframe.app.si994010.dto;

/**
*  The class Si520DeAndLengths is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/


import com.cloudframe.app.si994010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Si520DeAndLengths extends Si520DeAndLengthsSerialized { 
   
				private Si520De001 si520De001 = new Si520De001();
	
	/**
	* Constructor for Si520DeAndLengths
	**/
    public Si520DeAndLengths() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Si520DeAndLengths. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Si520DeAndLengths(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			si520De001.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of si520De001
	 *	@return si520De001
	 */   
	 public Si520De001 getSi520De001() {
   	return si520De001;
   }
   /**
	* 	Update Si520De001 with the passed value
	*   Corresponding COBOL Variable is SI520-DE001
	*	@param value
	*/
   public void setSi520De001(char[] value) {
      si520De001.setString(value); 
   }   
    
     /**
	 * 	Update Si520De001 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSi520De001(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,si520De001.begin,si520De001.length());
   }
   
     /**
	 * 	Update Si520De001 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi520De001(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,si520De001.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Si520De001 with another Field
	 *	@param value
	 */
   public void setSi520De001(Field source) {
   	replace(source,0,source.length(),si520De001.begin,si520De001.length());
   }  
   
     /**
	 * 	Update Si520De001 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSi520De001(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,si520De001.begin,si520De001.length());
   }
   
     /**
	 * 	Update Si520De001 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi520De001(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,si520De001.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSi520DeAndLengthsFieldLength() {
			return SI_520_DE_AND_LENGTHS_LENGTH;
		}

}
  
