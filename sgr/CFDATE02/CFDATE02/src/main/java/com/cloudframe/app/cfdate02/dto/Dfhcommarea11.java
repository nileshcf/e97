package com.cloudframe.app.cfdate02.dto;

/**
*  The class Dfhcommarea11 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dfhcommarea11 extends Dfhcommarea11Serialized { 
   
				private CmnDateValidOutputArea cmnDateValidOutputArea = new CmnDateValidOutputArea();
	
	/**
	* Constructor for Dfhcommarea11
	**/
    public Dfhcommarea11() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Dfhcommarea11. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dfhcommarea11(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnDateValidOutputArea.setParent(this,getStartOffset() + 10);
    } 

	/**
	 *	Returns the value of cmnDateValidOutputArea
	 *	@return cmnDateValidOutputArea
	 */   
	 public CmnDateValidOutputArea getCmnDateValidOutputArea() {
   	return cmnDateValidOutputArea;
   }
   /**
	* 	Update CmnDateValidOutputArea with the passed value
	*   Corresponding COBOL Variable is CMN-DATE-VALID-OUTPUT-AREA
	*	@param value
	*/
   public void setCmnDateValidOutputArea(char[] value) {
      cmnDateValidOutputArea.setString(value); 
   }   
    
     /**
	 * 	Update CmnDateValidOutputArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnDateValidOutputArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateValidOutputArea.begin,cmnDateValidOutputArea.length());
   }
   
     /**
	 * 	Update CmnDateValidOutputArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateValidOutputArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateValidOutputArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnDateValidOutputArea with another Field
	 *	@param value
	 */
   public void setCmnDateValidOutputArea(Field source) {
   	replace(source,0,source.length(),cmnDateValidOutputArea.begin,cmnDateValidOutputArea.length());
   }  
   
     /**
	 * 	Update CmnDateValidOutputArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnDateValidOutputArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateValidOutputArea.begin,cmnDateValidOutputArea.length());
   }
   
     /**
	 * 	Update CmnDateValidOutputArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateValidOutputArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateValidOutputArea.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDfhcommarea11FieldLength() {
			return DFHCOMMAREA_11_LENGTH;
		}

}
  
