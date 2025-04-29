package com.cloudframe.app.cfdate02.file.records;

/**
*  The class FlgusInEocTgp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FlgusInEocTgp extends FlgusInEocTgpSerialized { 
   

						private char[] flgusTgpRec = Field.fillLowValue(161);
	
	/**
	* Constructor for FlgusInEocTgp
	**/
    public FlgusInEocTgp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FlgusInEocTgp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FlgusInEocTgp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of flgusTgpRec
	 *	@return flgusTgpRec
	 */
   public char[] getFlgusTgpRec() throws CFException{
     if (isFlgusTgpRecModified()) { 
        flgusTgpRec = refreshFlgusTgpRec();
     }
   		return flgusTgpRec;
   }

  
	/**
	*  set variable flgusTgpRec
	*  Corresponding COBOL Variable is FLGUS-TGP-REC
	*  @param value
	**/
   public void setFlgusTgpRec(char[] value) {
      flgusTgpRec = checkFlgusTgpRecConstraints(value);
      serializeFlgusTgpRec(flgusTgpRec);
   } 

     /**
	 * 	Update FlgusTgpRec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFlgusTgpRec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFlgusTgpRec,flgusTgpRec.length);
   	
   }
   
   public void setFlgusTgpRec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFlgusTgpRec,flgusTgpRec.length);
   	
   }
   
     /**
	 * 	Update FlgusTgpRec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFlgusTgpRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFlgusTgpRec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FlgusTgpRec with another Field
	 *	@param value
	 */
   public void setFlgusTgpRec(Field source) {
       replace(source,0,source.length(),beginFlgusTgpRec,FLGUS_TGP_REC_LEN);
   	
   }  
   
     /**
	 * 	Update FlgusTgpRec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFlgusTgpRec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFlgusTgpRec,FLGUS_TGP_REC_LEN);
   	
   }
   
     /**
	 * 	Update FlgusTgpRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFlgusTgpRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFlgusTgpRec+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFlgusInEocTgpFieldLength() {
			return FLGUS_IN_EOC_TGP_LENGTH;
		}

}
  
