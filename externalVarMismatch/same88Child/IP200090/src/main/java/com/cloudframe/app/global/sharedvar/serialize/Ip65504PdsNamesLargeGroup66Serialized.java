package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup66Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup66Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup66Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_66_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2016S;
            protected  int beginIp65504P2016L;
            protected  int beginIp65504P2017S;
            protected  int beginIp65504P2017L;
            protected  int beginIp65504P2018S;
            protected  int beginIp65504P2018L;
            protected  int beginIp65504P2019S;
            protected  int beginIp65504P2019L;
            protected  int beginIp65504P2020S;
            protected  int beginIp65504P2020L;
            protected  int beginIp65504P2021S;
            protected  int beginIp65504P2021L;
            protected  int beginIp65504P2022S;
            protected  int beginIp65504P2022L;
            protected  int beginIp65504P2023S;
            protected  int beginIp65504P2023L;
            protected  int beginIp65504P2024S;
            protected  int beginIp65504P2024L;
            protected  int beginIp65504P2025S;
            protected  int beginIp65504P2025L;
            protected  int beginIp65504P2026S;
            protected  int beginIp65504P2026L;
            protected  int beginIp65504P2027S;
            protected  int beginIp65504P2027L;
            protected  int beginIp65504P2028S;
            protected  int beginIp65504P2028L;
            protected  int beginIp65504P2029S;
            protected  int beginIp65504P2029L;
            protected  int beginIp65504P2030S;
            protected  int beginIp65504P2030L;
            protected  int beginIp65504P2031S;
            protected  int beginIp65504P2031L;
            protected  int beginIp65504P2032S;
            protected  int beginIp65504P2032L;
            protected  int beginIp65504P2033S;
            protected  int beginIp65504P2033L;
            protected  int beginIp65504P2034S;
            protected  int beginIp65504P2034L;
            protected  int beginIp65504P2035S;
            protected  int beginIp65504P2035L;
            protected  int beginIp65504P2036S;
            protected  int beginIp65504P2036L;
            protected  int beginIp65504P2037S;
            protected  int beginIp65504P2037L;
            protected  int beginIp65504P2038S;
            protected  int beginIp65504P2038L;
            protected  int beginIp65504P2039S;
            protected  int beginIp65504P2039L;
            protected  int beginIp65504P2040S;
            protected  int beginIp65504P2040L;
            protected  int beginIp65504P2041S;
            protected  int beginIp65504P2041L;
            protected  int beginIp65504P2042S;
            protected  int beginIp65504P2042L;
            protected  int beginIp65504P2043S;
            protected  int beginIp65504P2043L;
            protected  int beginIp65504P2044S;
            protected  int beginIp65504P2044L;
            protected  int beginIp65504P2045S;
            protected  int beginIp65504P2045L;
            protected  int beginIp65504P2046S;
            protected  int beginIp65504P2046L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup66Serialized
	**/
    public Ip65504PdsNamesLargeGroup66Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup66Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup66Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup66Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,16116); // serialize this field at offset 16116 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup66Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 16116 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup66Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_66_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2016S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2016L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2017S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2017L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2018S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2018L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2019S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2019L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2020S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2020L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2021S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2021L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2022S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2022L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2023S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2023L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2024S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2024L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2025S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2025L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2026S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2026L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2027S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2027L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2028S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2028L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2029S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2029L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2030S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2030L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2031S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2031L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2032S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2032L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2033S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2033L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2034S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2034L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2035S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2035L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2036S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2036L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2037S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2037L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2038S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2038L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2039S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2039L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2040S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2040L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2041S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2041L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2042S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2042L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2043S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2043L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2044S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2044L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2045S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2045L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2046S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2046L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2016SCounter = -1;
         public boolean isIp65504P2016SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2016SCounter != sharedCounter;
            localIp65504P2016SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2016_S_LEN = 2;
  	/**
	 * serializeIp65504P2016S
	 */
	protected void serializeIp65504P2016S(short ip65504P2016S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2016S,IP_65504_P_2016_S_LEN)
                  ,beginIp65504P2016S
                  ,IP_65504_P_2016_S_LEN
                 );
            localIp65504P2016SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2016SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2016S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2016S() {	 
			return (getShort(beginIp65504P2016S));
   	}
         int localIp65504P2016LCounter = -1;
         public boolean isIp65504P2016LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2016LCounter != sharedCounter;
            localIp65504P2016LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2016_L_LEN = 2;
  	/**
	 * serializeIp65504P2016L
	 */
	protected void serializeIp65504P2016L(short ip65504P2016L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2016L,IP_65504_P_2016_L_LEN)
                  ,beginIp65504P2016L
                  ,IP_65504_P_2016_L_LEN
                 );
            localIp65504P2016LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2016LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2016L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2016L() {	 
			return (getShort(beginIp65504P2016L));
   	}
         int localIp65504P2017SCounter = -1;
         public boolean isIp65504P2017SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2017SCounter != sharedCounter;
            localIp65504P2017SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2017_S_LEN = 2;
  	/**
	 * serializeIp65504P2017S
	 */
	protected void serializeIp65504P2017S(short ip65504P2017S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2017S,IP_65504_P_2017_S_LEN)
                  ,beginIp65504P2017S
                  ,IP_65504_P_2017_S_LEN
                 );
            localIp65504P2017SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2017SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2017S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2017S() {	 
			return (getShort(beginIp65504P2017S));
   	}
         int localIp65504P2017LCounter = -1;
         public boolean isIp65504P2017LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2017LCounter != sharedCounter;
            localIp65504P2017LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2017_L_LEN = 2;
  	/**
	 * serializeIp65504P2017L
	 */
	protected void serializeIp65504P2017L(short ip65504P2017L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2017L,IP_65504_P_2017_L_LEN)
                  ,beginIp65504P2017L
                  ,IP_65504_P_2017_L_LEN
                 );
            localIp65504P2017LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2017LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2017L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2017L() {	 
			return (getShort(beginIp65504P2017L));
   	}
         int localIp65504P2018SCounter = -1;
         public boolean isIp65504P2018SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2018SCounter != sharedCounter;
            localIp65504P2018SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2018_S_LEN = 2;
  	/**
	 * serializeIp65504P2018S
	 */
	protected void serializeIp65504P2018S(short ip65504P2018S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2018S,IP_65504_P_2018_S_LEN)
                  ,beginIp65504P2018S
                  ,IP_65504_P_2018_S_LEN
                 );
            localIp65504P2018SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2018SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2018S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2018S() {	 
			return (getShort(beginIp65504P2018S));
   	}
         int localIp65504P2018LCounter = -1;
         public boolean isIp65504P2018LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2018LCounter != sharedCounter;
            localIp65504P2018LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2018_L_LEN = 2;
  	/**
	 * serializeIp65504P2018L
	 */
	protected void serializeIp65504P2018L(short ip65504P2018L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2018L,IP_65504_P_2018_L_LEN)
                  ,beginIp65504P2018L
                  ,IP_65504_P_2018_L_LEN
                 );
            localIp65504P2018LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2018LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2018L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2018L() {	 
			return (getShort(beginIp65504P2018L));
   	}
         int localIp65504P2019SCounter = -1;
         public boolean isIp65504P2019SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2019SCounter != sharedCounter;
            localIp65504P2019SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2019_S_LEN = 2;
  	/**
	 * serializeIp65504P2019S
	 */
	protected void serializeIp65504P2019S(short ip65504P2019S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2019S,IP_65504_P_2019_S_LEN)
                  ,beginIp65504P2019S
                  ,IP_65504_P_2019_S_LEN
                 );
            localIp65504P2019SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2019SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2019S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2019S() {	 
			return (getShort(beginIp65504P2019S));
   	}
         int localIp65504P2019LCounter = -1;
         public boolean isIp65504P2019LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2019LCounter != sharedCounter;
            localIp65504P2019LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2019_L_LEN = 2;
  	/**
	 * serializeIp65504P2019L
	 */
	protected void serializeIp65504P2019L(short ip65504P2019L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2019L,IP_65504_P_2019_L_LEN)
                  ,beginIp65504P2019L
                  ,IP_65504_P_2019_L_LEN
                 );
            localIp65504P2019LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2019LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2019L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2019L() {	 
			return (getShort(beginIp65504P2019L));
   	}
         int localIp65504P2020SCounter = -1;
         public boolean isIp65504P2020SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2020SCounter != sharedCounter;
            localIp65504P2020SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2020_S_LEN = 2;
  	/**
	 * serializeIp65504P2020S
	 */
	protected void serializeIp65504P2020S(short ip65504P2020S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2020S,IP_65504_P_2020_S_LEN)
                  ,beginIp65504P2020S
                  ,IP_65504_P_2020_S_LEN
                 );
            localIp65504P2020SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2020SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2020S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2020S() {	 
			return (getShort(beginIp65504P2020S));
   	}
         int localIp65504P2020LCounter = -1;
         public boolean isIp65504P2020LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2020LCounter != sharedCounter;
            localIp65504P2020LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2020_L_LEN = 2;
  	/**
	 * serializeIp65504P2020L
	 */
	protected void serializeIp65504P2020L(short ip65504P2020L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2020L,IP_65504_P_2020_L_LEN)
                  ,beginIp65504P2020L
                  ,IP_65504_P_2020_L_LEN
                 );
            localIp65504P2020LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2020LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2020L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2020L() {	 
			return (getShort(beginIp65504P2020L));
   	}
         int localIp65504P2021SCounter = -1;
         public boolean isIp65504P2021SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2021SCounter != sharedCounter;
            localIp65504P2021SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2021_S_LEN = 2;
  	/**
	 * serializeIp65504P2021S
	 */
	protected void serializeIp65504P2021S(short ip65504P2021S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2021S,IP_65504_P_2021_S_LEN)
                  ,beginIp65504P2021S
                  ,IP_65504_P_2021_S_LEN
                 );
            localIp65504P2021SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2021SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2021S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2021S() {	 
			return (getShort(beginIp65504P2021S));
   	}
         int localIp65504P2021LCounter = -1;
         public boolean isIp65504P2021LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2021LCounter != sharedCounter;
            localIp65504P2021LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2021_L_LEN = 2;
  	/**
	 * serializeIp65504P2021L
	 */
	protected void serializeIp65504P2021L(short ip65504P2021L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2021L,IP_65504_P_2021_L_LEN)
                  ,beginIp65504P2021L
                  ,IP_65504_P_2021_L_LEN
                 );
            localIp65504P2021LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2021LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2021L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2021L() {	 
			return (getShort(beginIp65504P2021L));
   	}
         int localIp65504P2022SCounter = -1;
         public boolean isIp65504P2022SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2022SCounter != sharedCounter;
            localIp65504P2022SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2022_S_LEN = 2;
  	/**
	 * serializeIp65504P2022S
	 */
	protected void serializeIp65504P2022S(short ip65504P2022S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2022S,IP_65504_P_2022_S_LEN)
                  ,beginIp65504P2022S
                  ,IP_65504_P_2022_S_LEN
                 );
            localIp65504P2022SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2022SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2022S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2022S() {	 
			return (getShort(beginIp65504P2022S));
   	}
         int localIp65504P2022LCounter = -1;
         public boolean isIp65504P2022LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2022LCounter != sharedCounter;
            localIp65504P2022LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2022_L_LEN = 2;
  	/**
	 * serializeIp65504P2022L
	 */
	protected void serializeIp65504P2022L(short ip65504P2022L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2022L,IP_65504_P_2022_L_LEN)
                  ,beginIp65504P2022L
                  ,IP_65504_P_2022_L_LEN
                 );
            localIp65504P2022LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2022LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2022L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2022L() {	 
			return (getShort(beginIp65504P2022L));
   	}
         int localIp65504P2023SCounter = -1;
         public boolean isIp65504P2023SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2023SCounter != sharedCounter;
            localIp65504P2023SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2023_S_LEN = 2;
  	/**
	 * serializeIp65504P2023S
	 */
	protected void serializeIp65504P2023S(short ip65504P2023S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2023S,IP_65504_P_2023_S_LEN)
                  ,beginIp65504P2023S
                  ,IP_65504_P_2023_S_LEN
                 );
            localIp65504P2023SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2023SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2023S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2023S() {	 
			return (getShort(beginIp65504P2023S));
   	}
         int localIp65504P2023LCounter = -1;
         public boolean isIp65504P2023LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2023LCounter != sharedCounter;
            localIp65504P2023LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2023_L_LEN = 2;
  	/**
	 * serializeIp65504P2023L
	 */
	protected void serializeIp65504P2023L(short ip65504P2023L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2023L,IP_65504_P_2023_L_LEN)
                  ,beginIp65504P2023L
                  ,IP_65504_P_2023_L_LEN
                 );
            localIp65504P2023LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2023LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2023L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2023L() {	 
			return (getShort(beginIp65504P2023L));
   	}
         int localIp65504P2024SCounter = -1;
         public boolean isIp65504P2024SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2024SCounter != sharedCounter;
            localIp65504P2024SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2024_S_LEN = 2;
  	/**
	 * serializeIp65504P2024S
	 */
	protected void serializeIp65504P2024S(short ip65504P2024S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2024S,IP_65504_P_2024_S_LEN)
                  ,beginIp65504P2024S
                  ,IP_65504_P_2024_S_LEN
                 );
            localIp65504P2024SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2024SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2024S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2024S() {	 
			return (getShort(beginIp65504P2024S));
   	}
         int localIp65504P2024LCounter = -1;
         public boolean isIp65504P2024LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2024LCounter != sharedCounter;
            localIp65504P2024LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2024_L_LEN = 2;
  	/**
	 * serializeIp65504P2024L
	 */
	protected void serializeIp65504P2024L(short ip65504P2024L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2024L,IP_65504_P_2024_L_LEN)
                  ,beginIp65504P2024L
                  ,IP_65504_P_2024_L_LEN
                 );
            localIp65504P2024LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2024LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2024L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2024L() {	 
			return (getShort(beginIp65504P2024L));
   	}
         int localIp65504P2025SCounter = -1;
         public boolean isIp65504P2025SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2025SCounter != sharedCounter;
            localIp65504P2025SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2025_S_LEN = 2;
  	/**
	 * serializeIp65504P2025S
	 */
	protected void serializeIp65504P2025S(short ip65504P2025S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2025S,IP_65504_P_2025_S_LEN)
                  ,beginIp65504P2025S
                  ,IP_65504_P_2025_S_LEN
                 );
            localIp65504P2025SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2025SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2025S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2025S() {	 
			return (getShort(beginIp65504P2025S));
   	}
         int localIp65504P2025LCounter = -1;
         public boolean isIp65504P2025LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2025LCounter != sharedCounter;
            localIp65504P2025LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2025_L_LEN = 2;
  	/**
	 * serializeIp65504P2025L
	 */
	protected void serializeIp65504P2025L(short ip65504P2025L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2025L,IP_65504_P_2025_L_LEN)
                  ,beginIp65504P2025L
                  ,IP_65504_P_2025_L_LEN
                 );
            localIp65504P2025LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2025LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2025L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2025L() {	 
			return (getShort(beginIp65504P2025L));
   	}
         int localIp65504P2026SCounter = -1;
         public boolean isIp65504P2026SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2026SCounter != sharedCounter;
            localIp65504P2026SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2026_S_LEN = 2;
  	/**
	 * serializeIp65504P2026S
	 */
	protected void serializeIp65504P2026S(short ip65504P2026S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2026S,IP_65504_P_2026_S_LEN)
                  ,beginIp65504P2026S
                  ,IP_65504_P_2026_S_LEN
                 );
            localIp65504P2026SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2026SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2026S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2026S() {	 
			return (getShort(beginIp65504P2026S));
   	}
         int localIp65504P2026LCounter = -1;
         public boolean isIp65504P2026LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2026LCounter != sharedCounter;
            localIp65504P2026LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2026_L_LEN = 2;
  	/**
	 * serializeIp65504P2026L
	 */
	protected void serializeIp65504P2026L(short ip65504P2026L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2026L,IP_65504_P_2026_L_LEN)
                  ,beginIp65504P2026L
                  ,IP_65504_P_2026_L_LEN
                 );
            localIp65504P2026LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2026LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2026L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2026L() {	 
			return (getShort(beginIp65504P2026L));
   	}
         int localIp65504P2027SCounter = -1;
         public boolean isIp65504P2027SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2027SCounter != sharedCounter;
            localIp65504P2027SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2027_S_LEN = 2;
  	/**
	 * serializeIp65504P2027S
	 */
	protected void serializeIp65504P2027S(short ip65504P2027S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2027S,IP_65504_P_2027_S_LEN)
                  ,beginIp65504P2027S
                  ,IP_65504_P_2027_S_LEN
                 );
            localIp65504P2027SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2027SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2027S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2027S() {	 
			return (getShort(beginIp65504P2027S));
   	}
         int localIp65504P2027LCounter = -1;
         public boolean isIp65504P2027LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2027LCounter != sharedCounter;
            localIp65504P2027LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2027_L_LEN = 2;
  	/**
	 * serializeIp65504P2027L
	 */
	protected void serializeIp65504P2027L(short ip65504P2027L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2027L,IP_65504_P_2027_L_LEN)
                  ,beginIp65504P2027L
                  ,IP_65504_P_2027_L_LEN
                 );
            localIp65504P2027LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2027LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2027L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2027L() {	 
			return (getShort(beginIp65504P2027L));
   	}
         int localIp65504P2028SCounter = -1;
         public boolean isIp65504P2028SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2028SCounter != sharedCounter;
            localIp65504P2028SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2028_S_LEN = 2;
  	/**
	 * serializeIp65504P2028S
	 */
	protected void serializeIp65504P2028S(short ip65504P2028S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2028S,IP_65504_P_2028_S_LEN)
                  ,beginIp65504P2028S
                  ,IP_65504_P_2028_S_LEN
                 );
            localIp65504P2028SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2028SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2028S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2028S() {	 
			return (getShort(beginIp65504P2028S));
   	}
         int localIp65504P2028LCounter = -1;
         public boolean isIp65504P2028LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2028LCounter != sharedCounter;
            localIp65504P2028LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2028_L_LEN = 2;
  	/**
	 * serializeIp65504P2028L
	 */
	protected void serializeIp65504P2028L(short ip65504P2028L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2028L,IP_65504_P_2028_L_LEN)
                  ,beginIp65504P2028L
                  ,IP_65504_P_2028_L_LEN
                 );
            localIp65504P2028LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2028LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2028L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2028L() {	 
			return (getShort(beginIp65504P2028L));
   	}
         int localIp65504P2029SCounter = -1;
         public boolean isIp65504P2029SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2029SCounter != sharedCounter;
            localIp65504P2029SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2029_S_LEN = 2;
  	/**
	 * serializeIp65504P2029S
	 */
	protected void serializeIp65504P2029S(short ip65504P2029S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2029S,IP_65504_P_2029_S_LEN)
                  ,beginIp65504P2029S
                  ,IP_65504_P_2029_S_LEN
                 );
            localIp65504P2029SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2029SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2029S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2029S() {	 
			return (getShort(beginIp65504P2029S));
   	}
         int localIp65504P2029LCounter = -1;
         public boolean isIp65504P2029LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2029LCounter != sharedCounter;
            localIp65504P2029LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2029_L_LEN = 2;
  	/**
	 * serializeIp65504P2029L
	 */
	protected void serializeIp65504P2029L(short ip65504P2029L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2029L,IP_65504_P_2029_L_LEN)
                  ,beginIp65504P2029L
                  ,IP_65504_P_2029_L_LEN
                 );
            localIp65504P2029LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2029LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2029L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2029L() {	 
			return (getShort(beginIp65504P2029L));
   	}
         int localIp65504P2030SCounter = -1;
         public boolean isIp65504P2030SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2030SCounter != sharedCounter;
            localIp65504P2030SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2030_S_LEN = 2;
  	/**
	 * serializeIp65504P2030S
	 */
	protected void serializeIp65504P2030S(short ip65504P2030S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2030S,IP_65504_P_2030_S_LEN)
                  ,beginIp65504P2030S
                  ,IP_65504_P_2030_S_LEN
                 );
            localIp65504P2030SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2030SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2030S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2030S() {	 
			return (getShort(beginIp65504P2030S));
   	}
         int localIp65504P2030LCounter = -1;
         public boolean isIp65504P2030LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2030LCounter != sharedCounter;
            localIp65504P2030LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2030_L_LEN = 2;
  	/**
	 * serializeIp65504P2030L
	 */
	protected void serializeIp65504P2030L(short ip65504P2030L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2030L,IP_65504_P_2030_L_LEN)
                  ,beginIp65504P2030L
                  ,IP_65504_P_2030_L_LEN
                 );
            localIp65504P2030LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2030LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2030L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2030L() {	 
			return (getShort(beginIp65504P2030L));
   	}
         int localIp65504P2031SCounter = -1;
         public boolean isIp65504P2031SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2031SCounter != sharedCounter;
            localIp65504P2031SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2031_S_LEN = 2;
  	/**
	 * serializeIp65504P2031S
	 */
	protected void serializeIp65504P2031S(short ip65504P2031S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2031S,IP_65504_P_2031_S_LEN)
                  ,beginIp65504P2031S
                  ,IP_65504_P_2031_S_LEN
                 );
            localIp65504P2031SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2031SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2031S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2031S() {	 
			return (getShort(beginIp65504P2031S));
   	}
         int localIp65504P2031LCounter = -1;
         public boolean isIp65504P2031LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2031LCounter != sharedCounter;
            localIp65504P2031LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2031_L_LEN = 2;
  	/**
	 * serializeIp65504P2031L
	 */
	protected void serializeIp65504P2031L(short ip65504P2031L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2031L,IP_65504_P_2031_L_LEN)
                  ,beginIp65504P2031L
                  ,IP_65504_P_2031_L_LEN
                 );
            localIp65504P2031LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2031LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2031L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2031L() {	 
			return (getShort(beginIp65504P2031L));
   	}
         int localIp65504P2032SCounter = -1;
         public boolean isIp65504P2032SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2032SCounter != sharedCounter;
            localIp65504P2032SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2032_S_LEN = 2;
  	/**
	 * serializeIp65504P2032S
	 */
	protected void serializeIp65504P2032S(short ip65504P2032S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2032S,IP_65504_P_2032_S_LEN)
                  ,beginIp65504P2032S
                  ,IP_65504_P_2032_S_LEN
                 );
            localIp65504P2032SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2032SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2032S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2032S() {	 
			return (getShort(beginIp65504P2032S));
   	}
         int localIp65504P2032LCounter = -1;
         public boolean isIp65504P2032LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2032LCounter != sharedCounter;
            localIp65504P2032LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2032_L_LEN = 2;
  	/**
	 * serializeIp65504P2032L
	 */
	protected void serializeIp65504P2032L(short ip65504P2032L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2032L,IP_65504_P_2032_L_LEN)
                  ,beginIp65504P2032L
                  ,IP_65504_P_2032_L_LEN
                 );
            localIp65504P2032LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2032LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2032L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2032L() {	 
			return (getShort(beginIp65504P2032L));
   	}
         int localIp65504P2033SCounter = -1;
         public boolean isIp65504P2033SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2033SCounter != sharedCounter;
            localIp65504P2033SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2033_S_LEN = 2;
  	/**
	 * serializeIp65504P2033S
	 */
	protected void serializeIp65504P2033S(short ip65504P2033S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2033S,IP_65504_P_2033_S_LEN)
                  ,beginIp65504P2033S
                  ,IP_65504_P_2033_S_LEN
                 );
            localIp65504P2033SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2033SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2033S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2033S() {	 
			return (getShort(beginIp65504P2033S));
   	}
         int localIp65504P2033LCounter = -1;
         public boolean isIp65504P2033LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2033LCounter != sharedCounter;
            localIp65504P2033LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2033_L_LEN = 2;
  	/**
	 * serializeIp65504P2033L
	 */
	protected void serializeIp65504P2033L(short ip65504P2033L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2033L,IP_65504_P_2033_L_LEN)
                  ,beginIp65504P2033L
                  ,IP_65504_P_2033_L_LEN
                 );
            localIp65504P2033LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2033LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2033L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2033L() {	 
			return (getShort(beginIp65504P2033L));
   	}
         int localIp65504P2034SCounter = -1;
         public boolean isIp65504P2034SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2034SCounter != sharedCounter;
            localIp65504P2034SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2034_S_LEN = 2;
  	/**
	 * serializeIp65504P2034S
	 */
	protected void serializeIp65504P2034S(short ip65504P2034S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2034S,IP_65504_P_2034_S_LEN)
                  ,beginIp65504P2034S
                  ,IP_65504_P_2034_S_LEN
                 );
            localIp65504P2034SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2034SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2034S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2034S() {	 
			return (getShort(beginIp65504P2034S));
   	}
         int localIp65504P2034LCounter = -1;
         public boolean isIp65504P2034LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2034LCounter != sharedCounter;
            localIp65504P2034LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2034_L_LEN = 2;
  	/**
	 * serializeIp65504P2034L
	 */
	protected void serializeIp65504P2034L(short ip65504P2034L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2034L,IP_65504_P_2034_L_LEN)
                  ,beginIp65504P2034L
                  ,IP_65504_P_2034_L_LEN
                 );
            localIp65504P2034LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2034LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2034L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2034L() {	 
			return (getShort(beginIp65504P2034L));
   	}
         int localIp65504P2035SCounter = -1;
         public boolean isIp65504P2035SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2035SCounter != sharedCounter;
            localIp65504P2035SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2035_S_LEN = 2;
  	/**
	 * serializeIp65504P2035S
	 */
	protected void serializeIp65504P2035S(short ip65504P2035S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2035S,IP_65504_P_2035_S_LEN)
                  ,beginIp65504P2035S
                  ,IP_65504_P_2035_S_LEN
                 );
            localIp65504P2035SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2035SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2035S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2035S() {	 
			return (getShort(beginIp65504P2035S));
   	}
         int localIp65504P2035LCounter = -1;
         public boolean isIp65504P2035LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2035LCounter != sharedCounter;
            localIp65504P2035LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2035_L_LEN = 2;
  	/**
	 * serializeIp65504P2035L
	 */
	protected void serializeIp65504P2035L(short ip65504P2035L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2035L,IP_65504_P_2035_L_LEN)
                  ,beginIp65504P2035L
                  ,IP_65504_P_2035_L_LEN
                 );
            localIp65504P2035LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2035LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2035L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2035L() {	 
			return (getShort(beginIp65504P2035L));
   	}
         int localIp65504P2036SCounter = -1;
         public boolean isIp65504P2036SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2036SCounter != sharedCounter;
            localIp65504P2036SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2036_S_LEN = 2;
  	/**
	 * serializeIp65504P2036S
	 */
	protected void serializeIp65504P2036S(short ip65504P2036S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2036S,IP_65504_P_2036_S_LEN)
                  ,beginIp65504P2036S
                  ,IP_65504_P_2036_S_LEN
                 );
            localIp65504P2036SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2036SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2036S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2036S() {	 
			return (getShort(beginIp65504P2036S));
   	}
         int localIp65504P2036LCounter = -1;
         public boolean isIp65504P2036LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2036LCounter != sharedCounter;
            localIp65504P2036LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2036_L_LEN = 2;
  	/**
	 * serializeIp65504P2036L
	 */
	protected void serializeIp65504P2036L(short ip65504P2036L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2036L,IP_65504_P_2036_L_LEN)
                  ,beginIp65504P2036L
                  ,IP_65504_P_2036_L_LEN
                 );
            localIp65504P2036LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2036LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2036L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2036L() {	 
			return (getShort(beginIp65504P2036L));
   	}
         int localIp65504P2037SCounter = -1;
         public boolean isIp65504P2037SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2037SCounter != sharedCounter;
            localIp65504P2037SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2037_S_LEN = 2;
  	/**
	 * serializeIp65504P2037S
	 */
	protected void serializeIp65504P2037S(short ip65504P2037S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2037S,IP_65504_P_2037_S_LEN)
                  ,beginIp65504P2037S
                  ,IP_65504_P_2037_S_LEN
                 );
            localIp65504P2037SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2037SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2037S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2037S() {	 
			return (getShort(beginIp65504P2037S));
   	}
         int localIp65504P2037LCounter = -1;
         public boolean isIp65504P2037LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2037LCounter != sharedCounter;
            localIp65504P2037LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2037_L_LEN = 2;
  	/**
	 * serializeIp65504P2037L
	 */
	protected void serializeIp65504P2037L(short ip65504P2037L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2037L,IP_65504_P_2037_L_LEN)
                  ,beginIp65504P2037L
                  ,IP_65504_P_2037_L_LEN
                 );
            localIp65504P2037LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2037LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2037L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2037L() {	 
			return (getShort(beginIp65504P2037L));
   	}
         int localIp65504P2038SCounter = -1;
         public boolean isIp65504P2038SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2038SCounter != sharedCounter;
            localIp65504P2038SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2038_S_LEN = 2;
  	/**
	 * serializeIp65504P2038S
	 */
	protected void serializeIp65504P2038S(short ip65504P2038S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2038S,IP_65504_P_2038_S_LEN)
                  ,beginIp65504P2038S
                  ,IP_65504_P_2038_S_LEN
                 );
            localIp65504P2038SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2038SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2038S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2038S() {	 
			return (getShort(beginIp65504P2038S));
   	}
         int localIp65504P2038LCounter = -1;
         public boolean isIp65504P2038LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2038LCounter != sharedCounter;
            localIp65504P2038LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2038_L_LEN = 2;
  	/**
	 * serializeIp65504P2038L
	 */
	protected void serializeIp65504P2038L(short ip65504P2038L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2038L,IP_65504_P_2038_L_LEN)
                  ,beginIp65504P2038L
                  ,IP_65504_P_2038_L_LEN
                 );
            localIp65504P2038LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2038LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2038L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2038L() {	 
			return (getShort(beginIp65504P2038L));
   	}
         int localIp65504P2039SCounter = -1;
         public boolean isIp65504P2039SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2039SCounter != sharedCounter;
            localIp65504P2039SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2039_S_LEN = 2;
  	/**
	 * serializeIp65504P2039S
	 */
	protected void serializeIp65504P2039S(short ip65504P2039S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2039S,IP_65504_P_2039_S_LEN)
                  ,beginIp65504P2039S
                  ,IP_65504_P_2039_S_LEN
                 );
            localIp65504P2039SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2039SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2039S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2039S() {	 
			return (getShort(beginIp65504P2039S));
   	}
         int localIp65504P2039LCounter = -1;
         public boolean isIp65504P2039LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2039LCounter != sharedCounter;
            localIp65504P2039LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2039_L_LEN = 2;
  	/**
	 * serializeIp65504P2039L
	 */
	protected void serializeIp65504P2039L(short ip65504P2039L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2039L,IP_65504_P_2039_L_LEN)
                  ,beginIp65504P2039L
                  ,IP_65504_P_2039_L_LEN
                 );
            localIp65504P2039LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2039LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2039L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2039L() {	 
			return (getShort(beginIp65504P2039L));
   	}
         int localIp65504P2040SCounter = -1;
         public boolean isIp65504P2040SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2040SCounter != sharedCounter;
            localIp65504P2040SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2040_S_LEN = 2;
  	/**
	 * serializeIp65504P2040S
	 */
	protected void serializeIp65504P2040S(short ip65504P2040S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2040S,IP_65504_P_2040_S_LEN)
                  ,beginIp65504P2040S
                  ,IP_65504_P_2040_S_LEN
                 );
            localIp65504P2040SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2040SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2040S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2040S() {	 
			return (getShort(beginIp65504P2040S));
   	}
         int localIp65504P2040LCounter = -1;
         public boolean isIp65504P2040LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2040LCounter != sharedCounter;
            localIp65504P2040LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2040_L_LEN = 2;
  	/**
	 * serializeIp65504P2040L
	 */
	protected void serializeIp65504P2040L(short ip65504P2040L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2040L,IP_65504_P_2040_L_LEN)
                  ,beginIp65504P2040L
                  ,IP_65504_P_2040_L_LEN
                 );
            localIp65504P2040LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2040LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2040L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2040L() {	 
			return (getShort(beginIp65504P2040L));
   	}
         int localIp65504P2041SCounter = -1;
         public boolean isIp65504P2041SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2041SCounter != sharedCounter;
            localIp65504P2041SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2041_S_LEN = 2;
  	/**
	 * serializeIp65504P2041S
	 */
	protected void serializeIp65504P2041S(short ip65504P2041S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2041S,IP_65504_P_2041_S_LEN)
                  ,beginIp65504P2041S
                  ,IP_65504_P_2041_S_LEN
                 );
            localIp65504P2041SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2041SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2041S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2041S() {	 
			return (getShort(beginIp65504P2041S));
   	}
         int localIp65504P2041LCounter = -1;
         public boolean isIp65504P2041LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2041LCounter != sharedCounter;
            localIp65504P2041LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2041_L_LEN = 2;
  	/**
	 * serializeIp65504P2041L
	 */
	protected void serializeIp65504P2041L(short ip65504P2041L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2041L,IP_65504_P_2041_L_LEN)
                  ,beginIp65504P2041L
                  ,IP_65504_P_2041_L_LEN
                 );
            localIp65504P2041LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2041LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2041L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2041L() {	 
			return (getShort(beginIp65504P2041L));
   	}
         int localIp65504P2042SCounter = -1;
         public boolean isIp65504P2042SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2042SCounter != sharedCounter;
            localIp65504P2042SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2042_S_LEN = 2;
  	/**
	 * serializeIp65504P2042S
	 */
	protected void serializeIp65504P2042S(short ip65504P2042S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2042S,IP_65504_P_2042_S_LEN)
                  ,beginIp65504P2042S
                  ,IP_65504_P_2042_S_LEN
                 );
            localIp65504P2042SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2042SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2042S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2042S() {	 
			return (getShort(beginIp65504P2042S));
   	}
         int localIp65504P2042LCounter = -1;
         public boolean isIp65504P2042LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2042LCounter != sharedCounter;
            localIp65504P2042LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2042_L_LEN = 2;
  	/**
	 * serializeIp65504P2042L
	 */
	protected void serializeIp65504P2042L(short ip65504P2042L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2042L,IP_65504_P_2042_L_LEN)
                  ,beginIp65504P2042L
                  ,IP_65504_P_2042_L_LEN
                 );
            localIp65504P2042LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2042LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2042L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2042L() {	 
			return (getShort(beginIp65504P2042L));
   	}
         int localIp65504P2043SCounter = -1;
         public boolean isIp65504P2043SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2043SCounter != sharedCounter;
            localIp65504P2043SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2043_S_LEN = 2;
  	/**
	 * serializeIp65504P2043S
	 */
	protected void serializeIp65504P2043S(short ip65504P2043S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2043S,IP_65504_P_2043_S_LEN)
                  ,beginIp65504P2043S
                  ,IP_65504_P_2043_S_LEN
                 );
            localIp65504P2043SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2043SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2043S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2043S() {	 
			return (getShort(beginIp65504P2043S));
   	}
         int localIp65504P2043LCounter = -1;
         public boolean isIp65504P2043LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2043LCounter != sharedCounter;
            localIp65504P2043LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2043_L_LEN = 2;
  	/**
	 * serializeIp65504P2043L
	 */
	protected void serializeIp65504P2043L(short ip65504P2043L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2043L,IP_65504_P_2043_L_LEN)
                  ,beginIp65504P2043L
                  ,IP_65504_P_2043_L_LEN
                 );
            localIp65504P2043LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2043LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2043L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2043L() {	 
			return (getShort(beginIp65504P2043L));
   	}
         int localIp65504P2044SCounter = -1;
         public boolean isIp65504P2044SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2044SCounter != sharedCounter;
            localIp65504P2044SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2044_S_LEN = 2;
  	/**
	 * serializeIp65504P2044S
	 */
	protected void serializeIp65504P2044S(short ip65504P2044S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2044S,IP_65504_P_2044_S_LEN)
                  ,beginIp65504P2044S
                  ,IP_65504_P_2044_S_LEN
                 );
            localIp65504P2044SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2044SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2044S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2044S() {	 
			return (getShort(beginIp65504P2044S));
   	}
         int localIp65504P2044LCounter = -1;
         public boolean isIp65504P2044LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2044LCounter != sharedCounter;
            localIp65504P2044LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2044_L_LEN = 2;
  	/**
	 * serializeIp65504P2044L
	 */
	protected void serializeIp65504P2044L(short ip65504P2044L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2044L,IP_65504_P_2044_L_LEN)
                  ,beginIp65504P2044L
                  ,IP_65504_P_2044_L_LEN
                 );
            localIp65504P2044LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2044LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2044L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2044L() {	 
			return (getShort(beginIp65504P2044L));
   	}
         int localIp65504P2045SCounter = -1;
         public boolean isIp65504P2045SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2045SCounter != sharedCounter;
            localIp65504P2045SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2045_S_LEN = 2;
  	/**
	 * serializeIp65504P2045S
	 */
	protected void serializeIp65504P2045S(short ip65504P2045S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2045S,IP_65504_P_2045_S_LEN)
                  ,beginIp65504P2045S
                  ,IP_65504_P_2045_S_LEN
                 );
            localIp65504P2045SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2045SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2045S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2045S() {	 
			return (getShort(beginIp65504P2045S));
   	}
         int localIp65504P2045LCounter = -1;
         public boolean isIp65504P2045LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2045LCounter != sharedCounter;
            localIp65504P2045LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2045_L_LEN = 2;
  	/**
	 * serializeIp65504P2045L
	 */
	protected void serializeIp65504P2045L(short ip65504P2045L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2045L,IP_65504_P_2045_L_LEN)
                  ,beginIp65504P2045L
                  ,IP_65504_P_2045_L_LEN
                 );
            localIp65504P2045LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2045LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2045L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2045L() {	 
			return (getShort(beginIp65504P2045L));
   	}
         int localIp65504P2046SCounter = -1;
         public boolean isIp65504P2046SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2046SCounter != sharedCounter;
            localIp65504P2046SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2046_S_LEN = 2;
  	/**
	 * serializeIp65504P2046S
	 */
	protected void serializeIp65504P2046S(short ip65504P2046S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2046S,IP_65504_P_2046_S_LEN)
                  ,beginIp65504P2046S
                  ,IP_65504_P_2046_S_LEN
                 );
            localIp65504P2046SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2046SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2046S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2046S() {	 
			return (getShort(beginIp65504P2046S));
   	}
         int localIp65504P2046LCounter = -1;
         public boolean isIp65504P2046LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2046LCounter != sharedCounter;
            localIp65504P2046LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2046_L_LEN = 2;
  	/**
	 * serializeIp65504P2046L
	 */
	protected void serializeIp65504P2046L(short ip65504P2046L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2046L,IP_65504_P_2046_L_LEN)
                  ,beginIp65504P2046L
                  ,IP_65504_P_2046_L_LEN
                 );
            localIp65504P2046LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2046LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2046L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2046L() {	 
			return (getShort(beginIp65504P2046L));
   	}




}
  
