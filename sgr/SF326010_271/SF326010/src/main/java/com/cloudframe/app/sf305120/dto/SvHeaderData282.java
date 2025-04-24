package com.cloudframe.app.sf305120.dto;

/**
*  The class SvHeaderData282 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class SvHeaderData282 extends SvHeaderData282Serialized { 
   

						private char[] svHeaderId282 = new char[2];

								private int svVersion282;

								private long svHdrLength282;

								private int svTlvLength282;
			private List<SvServiceTable282> svServiceTable282 = new ArrayList<>();
    	

						private char[] svFiller282 = new char[100];
	
	/**
	* Constructor for SvHeaderData282
	**/
    public SvHeaderData282() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < SV_SERVICE_TABLE_282_SIZE;arrayIndex++) {
						svServiceTable282.add(new SvServiceTable282(this, beginSvServiceTable282 + 
						arrayIndex * SvServiceTable282.getSvServiceTable282FieldLength()));
				}
	   	/*  end of offset */
								setSvHeaderId282(("SV").toCharArray());
								setSvVersion282(1);
								setSvHdrLength282(0L);
								setSvTlvLength282(0);
			for (int arrayIndex = 0; arrayIndex < SV_SERVICE_TABLE_282_SIZE;arrayIndex++) {
					svServiceTable282.add(new SvServiceTable282(this, beginSvServiceTable282 + 
						arrayIndex * SvServiceTable282.getSvServiceTable282FieldLength()));
			}
								setSvFiller282(pad(100," ".toCharArray(),' ',RIGHT_PAD));
    }


 

	/**
	 *	Returns the value of svHeaderId282
	 *	@return svHeaderId282
	 */
   public char[] getSvHeaderId282() throws CFException{
     if (isSvHeaderId282Modified()) { 
        svHeaderId282 = refreshSvHeaderId282();
     }
   		return svHeaderId282;
   }

  
	/**
	*  set variable svHeaderId282
	*  Corresponding COBOL Variable is 282-SV-HEADER-ID
	*  @param value
	**/
   public void setSvHeaderId282(char[] value) {
      svHeaderId282 = checkSvHeaderId282Constraints(value);
      serializeSvHeaderId282(svHeaderId282);
   } 

     /**
	 * 	Update SvHeaderId282 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSvHeaderId282(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSvHeaderId282,svHeaderId282.length);
   	
   }
   
   public void setSvHeaderId282(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSvHeaderId282,svHeaderId282.length);
   	
   }
   
     /**
	 * 	Update SvHeaderId282 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSvHeaderId282(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSvHeaderId282+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SvHeaderId282 with another Field
	 *	@param value
	 */
   public void setSvHeaderId282(Field source) {
       replace(source,0,source.length(),beginSvHeaderId282,SV_HEADER_ID_282_LEN);
   	
   }  
   
     /**
	 * 	Update SvHeaderId282 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSvHeaderId282(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSvHeaderId282,SV_HEADER_ID_282_LEN);
   	
   }
   
     /**
	 * 	Update SvHeaderId282 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSvHeaderId282(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSvHeaderId282+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of svVersion282
	 *	@return svVersion282
	 */
	public int getSvVersion282() throws CFException {
       if (isSvVersion282Modified()) { 
           svVersion282 = refreshSvVersion282();
        }
   		return svVersion282;
	}
	

	
	   
	/**
	 * 	Update SvVersion282 with the passed value
	 *  Corresponding COBOL Variable is 282-SV-VERSION
	 *	@param number
	 */
	public void setSvVersion282(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    svVersion282 = checkSvVersion282MaxLimit(number); 
		serializeSvVersion282(svVersion282);
	}
	

	public void setSvVersion282(long number) {
	    number = checkSvVersion282MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSvVersion282((int)number);
	}
	
	/**
	 * 	Update SvVersion282 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSvVersion282(char[] value) throws CFException {
		 svVersion282 = serializeSvVersion282(value);
	}
	/**
	 * 	Update SvVersion282 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSvVersion282String(char[] value) throws CFException {
		 setSvVersion282(value);
	}
	/**
	 *	Returns the value of svHdrLength282
	 *	@return svHdrLength282
	 */
	public long getSvHdrLength282() throws CFException {
       if (isSvHdrLength282Modified()) { 
           svHdrLength282 = refreshSvHdrLength282();
        }
   		return svHdrLength282;
	}
	

	
	   
	/**
	 * 	Update SvHdrLength282 with the passed value
	 *  Corresponding COBOL Variable is 282-SV-HDR-LENGTH
	 *	@param number
	 */
	public void setSvHdrLength282(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    svHdrLength282 = checkSvHdrLength282MaxLimit(number); 
		serializeSvHdrLength282(svHdrLength282);
	}
	

	/**
	 * 	Update SvHdrLength282 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSvHdrLength282(char[] value) throws CFException {
		 svHdrLength282 = serializeSvHdrLength282(value);
	}
	/**
	 * 	Update SvHdrLength282 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSvHdrLength282String(char[] value) throws CFException {
		 setSvHdrLength282(value);
	}
	/**
	 *	Returns the value of svTlvLength282
	 *	@return svTlvLength282
	 */
	public int getSvTlvLength282() throws CFException {
       if (isSvTlvLength282Modified()) { 
           svTlvLength282 = refreshSvTlvLength282();
        }
   		return svTlvLength282;
	}
	

	
	   
	/**
	 * 	Update SvTlvLength282 with the passed value
	 *  Corresponding COBOL Variable is 282-SV-TLV-LENGTH
	 *	@param number
	 */
	public void setSvTlvLength282(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    svTlvLength282 = checkSvTlvLength282MaxLimit(number); 
		serializeSvTlvLength282(svTlvLength282);
	}
	

	public void setSvTlvLength282(long number) {
	    number = checkSvTlvLength282MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSvTlvLength282((int)number);
	}
	
	/**
	 * 	Update SvTlvLength282 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSvTlvLength282(char[] value) throws CFException {
		 svTlvLength282 = serializeSvTlvLength282(value);
	}
	/**
	 * 	Update SvTlvLength282 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSvTlvLength282String(char[] value) throws CFException {
		 setSvTlvLength282(value);
	}
	/**
	 *	Returns the  value of svServiceTable282
	 *  Corresponding COBOL Variable is 282-SV-SERVICE-TABLE
	 *	@return svServiceTable282
	 */
   public List<SvServiceTable282> getSvServiceTable282() {
       return svServiceTable282;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return svServiceTable282
	 */
	public SvServiceTable282 getSvServiceTable282(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getSvServiceTable282(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= SV_SERVICE_TABLE_282_SIZE) {
             	index = SV_SERVICE_TABLE_282_SIZE -1; // can't exceed max array size
             	logger.trace("svServiceTable282 - Array index exceeded max Size {}, resetting it to max allowed",SV_SERVICE_TABLE_282_SIZE); 
	    }
		if (index >= svServiceTable282.size()) {
       		for (int fillIndex =  svServiceTable282.size() -1; fillIndex < index;fillIndex++) {
		       svServiceTable282.add(null);
		    }
			svServiceTable282.set(index,
			   	   	new SvServiceTable282(this,beginSvServiceTable282 + index * SvServiceTable282.getSvServiceTable282FieldLength()) 
				                        ); 	
		} 
   	   SvServiceTable282 value = svServiceTable282.get(index);
   	   if (value == null) {
   	      svServiceTable282.set(index,
			   	   	new SvServiceTable282(this,beginSvServiceTable282 + index * SvServiceTable282.getSvServiceTable282FieldLength()) 
				                        ); 
		  value = svServiceTable282.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update SvServiceTable282 at index with the passed value
	 *  Corresponding COBOL Variable is 282-SV-SERVICE-TABLE
	 *  @param index
	 *	@param value
	 */
  public void setSvServiceTable282(int index,char[] value) {
   	getSvServiceTable282(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of svFiller282
	 *	@return svFiller282
	 */
   public char[] getSvFiller282() throws CFException{
     if (isSvFiller282Modified()) { 
        svFiller282 = refreshSvFiller282();
     }
   		return svFiller282;
   }

  
	/**
	*  set variable svFiller282
	*  Corresponding COBOL Variable is 282-SV-FILLER
	*  @param value
	**/
   public void setSvFiller282(char[] value) {
      svFiller282 = checkSvFiller282Constraints(value);
      serializeSvFiller282(svFiller282);
   } 

     /**
	 * 	Update SvFiller282 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSvFiller282(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSvFiller282,svFiller282.length);
   	
   }
   
   public void setSvFiller282(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSvFiller282,svFiller282.length);
   	
   }
   
     /**
	 * 	Update SvFiller282 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSvFiller282(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSvFiller282+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SvFiller282 with another Field
	 *	@param value
	 */
   public void setSvFiller282(Field source) {
       replace(source,0,source.length(),beginSvFiller282,SV_FILLER_282_LEN);
   	
   }  
   
     /**
	 * 	Update SvFiller282 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSvFiller282(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSvFiller282,SV_FILLER_282_LEN);
   	
   }
   
     /**
	 * 	Update SvFiller282 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSvFiller282(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSvFiller282+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSvHeaderData282FieldLength() {
			return SV_HEADER_DATA_282_LENGTH;
		}

}
  
