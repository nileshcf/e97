package com.cloudframe.app.gp004760.dto;

/**
*  The class Gp004760CabTccExtract is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.gp004760.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Gp004760CabTccExtract extends Gp004760CabTccExtractSerialized {
   

								private int gp004760RecordId;
				private Gp004760CabTccArray gp004760CabTccArray = new Gp004760CabTccArray();

	
	/**
	* Constructor for Gp004760CabTccExtract
	**/
    public Gp004760CabTccExtract() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			gp004760CabTccArray.setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 252
             ,4
             );
    }


 

	/**
	 *	Returns the value of gp004760RecordId
	 *	@return gp004760RecordId
	 */
	public int getGp004760RecordId() throws CFException {
       if (isGp004760RecordIdModified()) { 
           gp004760RecordId = refreshGp004760RecordId();
        }
   		return gp004760RecordId;
	}
	

	
	   
	/**
	 * 	Update Gp004760RecordId with the passed value
	 *  Corresponding COBOL Variable is GP004760-RECORD-ID
	 *	@param number
	 */
	public void setGp004760RecordId(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    gp004760RecordId = checkGp004760RecordIdMaxLimit(number); 
		serializeGp004760RecordId(gp004760RecordId);
	}
	

	public void setGp004760RecordId(long number) {
	    number = checkGp004760RecordIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setGp004760RecordId((int)number);
	}
	
	/**
	 * 	Update Gp004760RecordId with the passed value
	 *	@param value (String or char[])
	 */
	public void setGp004760RecordId(char[] value) throws CFException {
		 gp004760RecordId = serializeGp004760RecordId(value);
	}
	/**
	 * 	Update Gp004760RecordId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setGp004760RecordIdString(char[] value) throws CFException {
		 setGp004760RecordId(value);
	}
	/**
	 *	Returns the value of gp004760CabTccArray
	 *	@return gp004760CabTccArray
	 */   
	 public Gp004760CabTccArray getGp004760CabTccArray() {
   	return gp004760CabTccArray;
   }
   /**
	* 	Update Gp004760CabTccArray with the passed value
	*   Corresponding COBOL Variable is GP004760-CAB-TCC-ARRAY
	*	@param value
	*/
   public void setGp004760CabTccArray(char[] value) {
      gp004760CabTccArray.setString(value); 
   }   
    
     /**
	 * 	Update Gp004760CabTccArray 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setGp004760CabTccArray(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,gp004760CabTccArray.begin,gp004760CabTccArray.length());
   }
   
     /**
	 * 	Update Gp004760CabTccArray 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGp004760CabTccArray(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,gp004760CabTccArray.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Gp004760CabTccArray with another Field
	 *	@param value
	 */
   public void setGp004760CabTccArray(Field source) {
   	replace(source,0,source.length(),gp004760CabTccArray.begin,gp004760CabTccArray.length());
   }  
   
     /**
	 * 	Update Gp004760CabTccArray 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setGp004760CabTccArray(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,gp004760CabTccArray.begin,gp004760CabTccArray.length());
   }
   
     /**
	 * 	Update Gp004760CabTccArray 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGp004760CabTccArray(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,gp004760CabTccArray.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getGp004760CabTccExtractFieldLength() {
			return GP_004760_CAB_TCC_EXTRACT_LENGTH;
		}

}
  
