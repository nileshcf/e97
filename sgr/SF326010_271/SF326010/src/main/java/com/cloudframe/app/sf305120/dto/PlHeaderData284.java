package com.cloudframe.app.sf305120.dto;

/**
*  The class PlHeaderData284 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PlHeaderData284 extends PlHeaderData284Serialized {
   

						private char[] plHeaderId284 = new char[2];

								private int plVersion284;

								private long plHdrLength284;

								private int plTlvLength284;

						private char[] plPayloadType284 = new char[4];

								private long plPayloadLnth284;

						private char[] plPayloadData284 = new char[2000];
	
	/**
	* Constructor for PlHeaderData284
	**/
    public PlHeaderData284() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPlHeaderId284(("PL").toCharArray());
								setPlVersion284(1);
								setPlHdrLength284(0L);
								setPlTlvLength284(0);
								setPlPayloadType284(fillSpace(4));
								setPlPayloadLnth284(0L);
								setPlPayloadData284(pad(2000," ".toCharArray(),' ',RIGHT_PAD));
    }


 

	/**
	 *	Returns the value of plHeaderId284
	 *	@return plHeaderId284
	 */
   public char[] getPlHeaderId284() throws CFException{
     if (isPlHeaderId284Modified()) { 
        plHeaderId284 = refreshPlHeaderId284();
     }
   		return plHeaderId284;
   }

  
	/**
	*  set variable plHeaderId284
	*  Corresponding COBOL Variable is 284-PL-HEADER-ID
	*  @param value
	**/
   public void setPlHeaderId284(char[] value) {
      plHeaderId284 = checkPlHeaderId284Constraints(value);
      serializePlHeaderId284(plHeaderId284);
   } 

     /**
	 * 	Update PlHeaderId284 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPlHeaderId284(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPlHeaderId284,plHeaderId284.length);
   	
   }
   
   public void setPlHeaderId284(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPlHeaderId284,plHeaderId284.length);
   	
   }
   
     /**
	 * 	Update PlHeaderId284 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPlHeaderId284(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlHeaderId284+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PlHeaderId284 with another Field
	 *	@param value
	 */
   public void setPlHeaderId284(Field source) {
       replace(source,0,source.length(),beginPlHeaderId284,PL_HEADER_ID_284_LEN);
   	
   }  
   
     /**
	 * 	Update PlHeaderId284 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPlHeaderId284(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPlHeaderId284,PL_HEADER_ID_284_LEN);
   	
   }
   
     /**
	 * 	Update PlHeaderId284 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPlHeaderId284(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlHeaderId284+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of plVersion284
	 *	@return plVersion284
	 */
	public int getPlVersion284() throws CFException {
       if (isPlVersion284Modified()) { 
           plVersion284 = refreshPlVersion284();
        }
   		return plVersion284;
	}
	

	
	   
	/**
	 * 	Update PlVersion284 with the passed value
	 *  Corresponding COBOL Variable is 284-PL-VERSION
	 *	@param number
	 */
	public void setPlVersion284(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    plVersion284 = checkPlVersion284MaxLimit(number); 
		serializePlVersion284(plVersion284);
	}
	

	public void setPlVersion284(long number) {
	    number = checkPlVersion284MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPlVersion284((int)number);
	}
	
	/**
	 * 	Update PlVersion284 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlVersion284(char[] value) throws CFException {
		 plVersion284 = serializePlVersion284(value);
	}
	/**
	 * 	Update PlVersion284 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlVersion284String(char[] value) throws CFException {
		 setPlVersion284(value);
	}
	/**
	 *	Returns the value of plHdrLength284
	 *	@return plHdrLength284
	 */
	public long getPlHdrLength284() throws CFException {
       if (isPlHdrLength284Modified()) { 
           plHdrLength284 = refreshPlHdrLength284();
        }
   		return plHdrLength284;
	}
	

	
	   
	/**
	 * 	Update PlHdrLength284 with the passed value
	 *  Corresponding COBOL Variable is 284-PL-HDR-LENGTH
	 *	@param number
	 */
	public void setPlHdrLength284(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    plHdrLength284 = checkPlHdrLength284MaxLimit(number); 
		serializePlHdrLength284(plHdrLength284);
	}
	

	/**
	 * 	Update PlHdrLength284 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlHdrLength284(char[] value) throws CFException {
		 plHdrLength284 = serializePlHdrLength284(value);
	}
	/**
	 * 	Update PlHdrLength284 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlHdrLength284String(char[] value) throws CFException {
		 setPlHdrLength284(value);
	}
	/**
	 *	Returns the value of plTlvLength284
	 *	@return plTlvLength284
	 */
	public int getPlTlvLength284() throws CFException {
       if (isPlTlvLength284Modified()) { 
           plTlvLength284 = refreshPlTlvLength284();
        }
   		return plTlvLength284;
	}
	

	
	   
	/**
	 * 	Update PlTlvLength284 with the passed value
	 *  Corresponding COBOL Variable is 284-PL-TLV-LENGTH
	 *	@param number
	 */
	public void setPlTlvLength284(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    plTlvLength284 = checkPlTlvLength284MaxLimit(number); 
		serializePlTlvLength284(plTlvLength284);
	}
	

	public void setPlTlvLength284(long number) {
	    number = checkPlTlvLength284MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPlTlvLength284((int)number);
	}
	
	/**
	 * 	Update PlTlvLength284 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlTlvLength284(char[] value) throws CFException {
		 plTlvLength284 = serializePlTlvLength284(value);
	}
	/**
	 * 	Update PlTlvLength284 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlTlvLength284String(char[] value) throws CFException {
		 setPlTlvLength284(value);
	}
	/**
	 *	Returns the value of plPayloadType284
	 *	@return plPayloadType284
	 */
   public char[] getPlPayloadType284() throws CFException{
     if (isPlPayloadType284Modified()) { 
        plPayloadType284 = refreshPlPayloadType284();
     }
   		return plPayloadType284;
   }

  
	/**
	*  set variable plPayloadType284
	*  Corresponding COBOL Variable is 284-PL-PAYLOAD-TYPE
	*  @param value
	**/
   public void setPlPayloadType284(char[] value) {
      plPayloadType284 = checkPlPayloadType284Constraints(value);
      serializePlPayloadType284(plPayloadType284);
   } 

     /**
	 * 	Update PlPayloadType284 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPlPayloadType284(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPlPayloadType284,plPayloadType284.length);
   	
   }
   
   public void setPlPayloadType284(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPlPayloadType284,plPayloadType284.length);
   	
   }
   
     /**
	 * 	Update PlPayloadType284 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPlPayloadType284(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlPayloadType284+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PlPayloadType284 with another Field
	 *	@param value
	 */
   public void setPlPayloadType284(Field source) {
       replace(source,0,source.length(),beginPlPayloadType284,PL_PAYLOAD_TYPE_284_LEN);
   	
   }  
   
     /**
	 * 	Update PlPayloadType284 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPlPayloadType284(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPlPayloadType284,PL_PAYLOAD_TYPE_284_LEN);
   	
   }
   
     /**
	 * 	Update PlPayloadType284 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPlPayloadType284(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlPayloadType284+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of plPayloadLnth284
	 *	@return plPayloadLnth284
	 */
	public long getPlPayloadLnth284() throws CFException {
       if (isPlPayloadLnth284Modified()) { 
           plPayloadLnth284 = refreshPlPayloadLnth284();
        }
   		return plPayloadLnth284;
	}
	

	
	   
	/**
	 * 	Update PlPayloadLnth284 with the passed value
	 *  Corresponding COBOL Variable is 284-PL-PAYLOAD-LNTH
	 *	@param number
	 */
	public void setPlPayloadLnth284(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    plPayloadLnth284 = checkPlPayloadLnth284MaxLimit(number); 
		serializePlPayloadLnth284(plPayloadLnth284);
	}
	

	/**
	 * 	Update PlPayloadLnth284 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlPayloadLnth284(char[] value) throws CFException {
		 plPayloadLnth284 = serializePlPayloadLnth284(value);
	}
	/**
	 * 	Update PlPayloadLnth284 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlPayloadLnth284String(char[] value) throws CFException {
		 setPlPayloadLnth284(value);
	}
	/**
	 *	Returns the value of plPayloadData284
	 *	@return plPayloadData284
	 */
   public char[] getPlPayloadData284() throws CFException{
     if (isPlPayloadData284Modified()) { 
        plPayloadData284 = refreshPlPayloadData284();
     }
   		return plPayloadData284;
   }

  
	/**
	*  set variable plPayloadData284
	*  Corresponding COBOL Variable is 284-PL-PAYLOAD-DATA
	*  @param value
	**/
   public void setPlPayloadData284(char[] value) {
      plPayloadData284 = checkPlPayloadData284Constraints(value);
      serializePlPayloadData284(plPayloadData284);
   } 

     /**
	 * 	Update PlPayloadData284 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPlPayloadData284(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPlPayloadData284,plPayloadData284.length);
   	
   }
   
   public void setPlPayloadData284(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPlPayloadData284,plPayloadData284.length);
   	
   }
   
     /**
	 * 	Update PlPayloadData284 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPlPayloadData284(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlPayloadData284+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PlPayloadData284 with another Field
	 *	@param value
	 */
   public void setPlPayloadData284(Field source) {
       replace(source,0,source.length(),beginPlPayloadData284,PL_PAYLOAD_DATA_284_LEN);
   	
   }  
   
     /**
	 * 	Update PlPayloadData284 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPlPayloadData284(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPlPayloadData284,PL_PAYLOAD_DATA_284_LEN);
   	
   }
   
     /**
	 * 	Update PlPayloadData284 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPlPayloadData284(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlPayloadData284+targetIndex,targetLen);
    
   }

	
	
	

		public static int getPlHeaderData284FieldLength() {
			return PL_HEADER_DATA_284_LENGTH;
		}

}
  
