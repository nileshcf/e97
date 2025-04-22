package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdBondCallMmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdBondCallMmddyycc extends MsdBondCallMmddyyccSerialized { 
   
				private MsdBondCallMmddyy msdBondCallMmddyy = new MsdBondCallMmddyy();

								private int msdBondCallCc;
	
	/**
	* Constructor for MsdBondCallMmddyycc
	**/
    public MsdBondCallMmddyycc() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdBondCallMmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondCallMmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			msdBondCallMmddyy.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of msdBondCallMmddyy
	 *	@return msdBondCallMmddyy
	 */   
	 public MsdBondCallMmddyy getMsdBondCallMmddyy() {
   	return msdBondCallMmddyy;
   }
   /**
	* 	Update MsdBondCallMmddyy with the passed value
	*   Corresponding COBOL Variable is MSD-BOND-CALL-MMDDYY
	*	@param value
	*/
   public void setMsdBondCallMmddyy(char[] value) {
      msdBondCallMmddyy.setString(value); 
   }   
    
     /**
	 * 	Update MsdBondCallMmddyy 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdBondCallMmddyy(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdBondCallMmddyy.begin,msdBondCallMmddyy.length());
   }
   
     /**
	 * 	Update MsdBondCallMmddyy 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondCallMmddyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdBondCallMmddyy.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdBondCallMmddyy with another Field
	 *	@param value
	 */
   public void setMsdBondCallMmddyy(Field source) {
   	replace(source,0,source.length(),msdBondCallMmddyy.begin,msdBondCallMmddyy.length());
   }  
   
     /**
	 * 	Update MsdBondCallMmddyy 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdBondCallMmddyy(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdBondCallMmddyy.begin,msdBondCallMmddyy.length());
   }
   
     /**
	 * 	Update MsdBondCallMmddyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondCallMmddyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdBondCallMmddyy.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdBondCallCc
	 *	@return msdBondCallCc
	 */
	public int getMsdBondCallCc() throws CFException {
       if (isMsdBondCallCcModified()) { 
           msdBondCallCc = refreshMsdBondCallCc();
        }
   		return msdBondCallCc;
	}
	

	
	   
	/**
	 * 	Update MsdBondCallCc with the passed value
	 *  Corresponding COBOL Variable is MSD-BOND-CALL-CC
	 *	@param number
	 */
	public void setMsdBondCallCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdBondCallCc = checkMsdBondCallCcMaxLimit(number); 
		serializeMsdBondCallCc(msdBondCallCc);
	}
	

	public void setMsdBondCallCc(long number) {
	    number = checkMsdBondCallCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdBondCallCc((int)number);
	}
	
	/**
	 * 	Update MsdBondCallCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondCallCc(char[] value) throws CFException {
		 msdBondCallCc = serializeMsdBondCallCc(value);
	}
	/**
	 * 	Update MsdBondCallCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdBondCallCcString(char[] value) throws CFException {
		 setMsdBondCallCc(value);
	}

	
	
	
	/**
	 * 	initializes MsdBondCallMmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          msdBondCallMmddyy.initialize();
     
                     setMsdBondCallCc(0);
   }

		public static int getMsdBondCallMmddyyccFieldLength() {
			return MSD_BOND_CALL_MMDDYYCC_LENGTH;
		}

}
  
