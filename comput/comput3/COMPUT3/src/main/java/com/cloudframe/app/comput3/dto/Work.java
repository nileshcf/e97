package com.cloudframe.app.comput3.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:04. using version 5.0.0.254
**/


import com.cloudframe.app.comput3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;


public class Work extends WorkSerialized {
   

								private BigDecimal wvTempVolume;

								private BigDecimal wvWorkingQty;

								private long wvSourceScale;

								private BigDecimal wvUnsignedVolume = BigDecimal.ZERO;

								private BigDecimal dexr001SourceQty = BigDecimal.ZERO;

								private BigDecimal dexr001TargetQty = BigDecimal.ZERO;

								private short wvSourceSub;

								private short wvTargetSub;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWvUnsignedVolume(BigDecimal.ZERO);
								setWvSourceSub((short)0);
								setWvTargetSub((short)0);
    }


 

	/**
	 *	Returns the value of wvTempVolume
	 *	@return wvTempVolume
	 */
   public BigDecimal getWvTempVolume() {
	if (isWvTempVolumeModified()) {
		wvTempVolume = refreshWvTempVolume();
	}
   	return wvTempVolume;
   }

  
	/**
	*  set variable wvTempVolume
	*  @param value
	**/
   public void setWvTempVolume(BigDecimal value) {
	setWvTempVolume(value, true);
   } 


	/**
	 *	Update WvTempVolume with the passed value and serialize the object if setModified is true
	 *	@param value
	 *	@param setModified
	 */
   private void setWvTempVolume(BigDecimal value,boolean setModified) {
      wvTempVolume = value;
      if (setModified) {
          serializeWvTempVolume(value);
      }
   }  
	
	
	/**
	 *	Returns the value of wvWorkingQty
	 *	@return wvWorkingQty
	 */
   public BigDecimal getWvWorkingQty() {
	if (isWvWorkingQtyModified()) {
		wvWorkingQty = refreshWvWorkingQty();
	}
   	return wvWorkingQty;
   }

  
	/**
	*  set variable wvWorkingQty
	*  @param value
	**/
   public void setWvWorkingQty(BigDecimal value) {
	setWvWorkingQty(value, true);
   } 


	/**
	 *	Update WvWorkingQty with the passed value and serialize the object if setModified is true
	 *	@param value
	 *	@param setModified
	 */
   private void setWvWorkingQty(BigDecimal value,boolean setModified) {
      wvWorkingQty = value;
      if (setModified) {
          serializeWvWorkingQty(value);
      }
   }  
	
	
	public long getWvSourceScale() throws CFException {
        if (isWvSourceScaleModified()) { 
           wvSourceScale = refreshWvSourceScale();
        }
   		return wvSourceScale;
	}
	
	/**
	 * 	Update WvSourceScale with the passed value
	 *  Corresponding COBOL Variable is WV-SOURCE-SCALE
	 *	@param number
	 */
	public void setWvSourceScale(long number) {
			wvSourceScale = checkWvSourceScaleMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeWvSourceScale(wvSourceScale);
	}


	/**
	 *	Returns the value of wvUnsignedVolume
	 *	@return wvUnsignedVolume
	 */
	public BigDecimal getWvUnsignedVolume() throws CFException {
       if (isWvUnsignedVolumeModified()) { 
           wvUnsignedVolume = refreshWvUnsignedVolume();
        }
   		return wvUnsignedVolume;
	}
	

	
	   
	/**
	 * 	Update WvUnsignedVolume with the passed number
	 *  Corresponding COBOL Variable is WV-UNSIGNED-VOLUME
	 *	@param number
	 */
	public void setWvUnsignedVolume(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       wvUnsignedVolume = checkWvUnsignedVolumeMaxLimit(number);
	    serializeWvUnsignedVolume(wvUnsignedVolume);
   }
	/**
	 * 	Update WvUnsignedVolume with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvUnsignedVolume(char[] value) throws CFException {
		 wvUnsignedVolume = serializeWvUnsignedVolume(value);
	}   
	public BigDecimal getDexr001SourceQty() throws CFException {
        if (isDexr001SourceQtyModified()) { 
           dexr001SourceQty = refreshDexr001SourceQty();
        }
   		return dexr001SourceQty;
	}

    public char[] getDexr001SourceQtyString() {
          return  dexr001SourceQtyString();
    }
	
	/**
	 * 	Update Dexr001SourceQty with the passed number
	 *  Corresponding COBOL Variable is DEXR001-SOURCE-QTY
	 *	@param number
	 */
	public void setDexr001SourceQty(BigDecimal number) {	
     dexr001SourceQty = checkDexr001SourceQtyMaxLimit(number);
	    serializeDexr001SourceQty(dexr001SourceQty);
   }
	public BigDecimal getDexr001TargetQty() throws CFException {
        if (isDexr001TargetQtyModified()) { 
           dexr001TargetQty = refreshDexr001TargetQty();
        }
   		return dexr001TargetQty;
	}

    public char[] getDexr001TargetQtyString() {
          return  dexr001TargetQtyString();
    }
	
	/**
	 * 	Update Dexr001TargetQty with the passed number
	 *  Corresponding COBOL Variable is DEXR001-TARGET-QTY
	 *	@param number
	 */
	public void setDexr001TargetQty(BigDecimal number) {	
     dexr001TargetQty = checkDexr001TargetQtyMaxLimit(number);
	    serializeDexr001TargetQty(dexr001TargetQty);
   }
	/**
	 *	Returns the value of wvSourceSub
	 *	@return wvSourceSub
	 */
	public short getWvSourceSub() throws CFException {
   		return wvSourceSub;
	}
	
	/**
	 * 	Update WvSourceSub with the passed value
	 *  Corresponding COBOL Variable is WV-SOURCE-SUB
	 *	@param number
	 */
	public void setWvSourceSub(short number) {
	     // Truncate if the number is beyond +/- Max range
	    wvSourceSub = checkWvSourceSubMaxLimit(number); 
	}

	public void setWvSourceSub(int number) {
	    number = checkWvSourceSubMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvSourceSub((short)number);
	}
	public void setWvSourceSub(long number) {
	    number = checkWvSourceSubMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvSourceSub((short)number);
	}
	

	/**
	 *	Returns the value of wvTargetSub
	 *	@return wvTargetSub
	 */
	public short getWvTargetSub() throws CFException {
   		return wvTargetSub;
	}
	
	/**
	 * 	Update WvTargetSub with the passed value
	 *  Corresponding COBOL Variable is WV-TARGET-SUB
	 *	@param number
	 */
	public void setWvTargetSub(short number) {
	     // Truncate if the number is beyond +/- Max range
	    wvTargetSub = checkWvTargetSubMaxLimit(number); 
	}

	public void setWvTargetSub(int number) {
	    number = checkWvTargetSubMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvTargetSub((short)number);
	}
	public void setWvTargetSub(long number) {
	    number = checkWvTargetSubMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvTargetSub((short)number);
	}
	


	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
