package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup67Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup67Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup67Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_67_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2047S;
            protected  int beginIp65504P2047L;
            protected  int beginIp65504P2048S;
            protected  int beginIp65504P2048L;
            protected  int beginIp65504P2049S;
            protected  int beginIp65504P2049L;
            protected  int beginIp65504P2050S;
            protected  int beginIp65504P2050L;
            protected  int beginIp65504P2051S;
            protected  int beginIp65504P2051L;
            protected  int beginIp65504P2052S;
            protected  int beginIp65504P2052L;
            protected  int beginIp65504P2053S;
            protected  int beginIp65504P2053L;
            protected  int beginIp65504P2054S;
            protected  int beginIp65504P2054L;
            protected  int beginIp65504P2055S;
            protected  int beginIp65504P2055L;
            protected  int beginIp65504P2056S;
            protected  int beginIp65504P2056L;
            protected  int beginIp65504P2057S;
            protected  int beginIp65504P2057L;
            protected  int beginIp65504P2058S;
            protected  int beginIp65504P2058L;
            protected  int beginIp65504P2059S;
            protected  int beginIp65504P2059L;
            protected  int beginIp65504P2060S;
            protected  int beginIp65504P2060L;
            protected  int beginIp65504P2061S;
            protected  int beginIp65504P2061L;
            protected  int beginIp65504P2062S;
            protected  int beginIp65504P2062L;
            protected  int beginIp65504P2063S;
            protected  int beginIp65504P2063L;
            protected  int beginIp65504P2064S;
            protected  int beginIp65504P2064L;
            protected  int beginIp65504P2065S;
            protected  int beginIp65504P2065L;
            protected  int beginIp65504P2066S;
            protected  int beginIp65504P2066L;
            protected  int beginIp65504P2067S;
            protected  int beginIp65504P2067L;
            protected  int beginIp65504P2068S;
            protected  int beginIp65504P2068L;
            protected  int beginIp65504P2069S;
            protected  int beginIp65504P2069L;
            protected  int beginIp65504P2070S;
            protected  int beginIp65504P2070L;
            protected  int beginIp65504P2071S;
            protected  int beginIp65504P2071L;
            protected  int beginIp65504P2072S;
            protected  int beginIp65504P2072L;
            protected  int beginIp65504P2073S;
            protected  int beginIp65504P2073L;
            protected  int beginIp65504P2074S;
            protected  int beginIp65504P2074L;
            protected  int beginIp65504P2075S;
            protected  int beginIp65504P2075L;
            protected  int beginIp65504P2076S;
            protected  int beginIp65504P2076L;
            protected  int beginIp65504P2077S;
            protected  int beginIp65504P2077L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup67Serialized
	**/
    public Ip65504PdsNamesLargeGroup67Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup67Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup67Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup67Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,16364); // serialize this field at offset 16364 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup67Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 16364 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup67Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_67_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2047S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2047L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2048S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2048L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2049S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2049L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2050S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2050L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2051S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2051L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2052S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2052L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2053S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2053L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2054S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2054L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2055S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2055L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2056S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2056L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2057S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2057L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2058S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2058L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2059S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2059L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2060S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2060L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2061S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2061L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2062S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2062L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2063S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2063L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2064S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2064L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2065S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2065L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2066S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2066L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2067S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2067L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2068S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2068L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2069S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2069L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2070S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2070L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2071S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2071L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2072S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2072L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2073S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2073L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2074S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2074L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2075S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2075L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2076S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2076L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2077S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2077L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2047SCounter = -1;
         public boolean isIp65504P2047SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2047SCounter != sharedCounter;
            localIp65504P2047SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2047_S_LEN = 2;
  	/**
	 * serializeIp65504P2047S
	 */
	protected void serializeIp65504P2047S(short ip65504P2047S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2047S,IP_65504_P_2047_S_LEN)
                  ,beginIp65504P2047S
                  ,IP_65504_P_2047_S_LEN
                 );
            localIp65504P2047SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2047SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2047S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2047S() {	 
			return (getShort(beginIp65504P2047S));
   	}
         int localIp65504P2047LCounter = -1;
         public boolean isIp65504P2047LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2047LCounter != sharedCounter;
            localIp65504P2047LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2047_L_LEN = 2;
  	/**
	 * serializeIp65504P2047L
	 */
	protected void serializeIp65504P2047L(short ip65504P2047L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2047L,IP_65504_P_2047_L_LEN)
                  ,beginIp65504P2047L
                  ,IP_65504_P_2047_L_LEN
                 );
            localIp65504P2047LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2047LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2047L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2047L() {	 
			return (getShort(beginIp65504P2047L));
   	}
         int localIp65504P2048SCounter = -1;
         public boolean isIp65504P2048SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2048SCounter != sharedCounter;
            localIp65504P2048SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2048_S_LEN = 2;
  	/**
	 * serializeIp65504P2048S
	 */
	protected void serializeIp65504P2048S(short ip65504P2048S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2048S,IP_65504_P_2048_S_LEN)
                  ,beginIp65504P2048S
                  ,IP_65504_P_2048_S_LEN
                 );
            localIp65504P2048SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2048SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2048S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2048S() {	 
			return (getShort(beginIp65504P2048S));
   	}
         int localIp65504P2048LCounter = -1;
         public boolean isIp65504P2048LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2048LCounter != sharedCounter;
            localIp65504P2048LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2048_L_LEN = 2;
  	/**
	 * serializeIp65504P2048L
	 */
	protected void serializeIp65504P2048L(short ip65504P2048L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2048L,IP_65504_P_2048_L_LEN)
                  ,beginIp65504P2048L
                  ,IP_65504_P_2048_L_LEN
                 );
            localIp65504P2048LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2048LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2048L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2048L() {	 
			return (getShort(beginIp65504P2048L));
   	}
         int localIp65504P2049SCounter = -1;
         public boolean isIp65504P2049SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2049SCounter != sharedCounter;
            localIp65504P2049SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2049_S_LEN = 2;
  	/**
	 * serializeIp65504P2049S
	 */
	protected void serializeIp65504P2049S(short ip65504P2049S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2049S,IP_65504_P_2049_S_LEN)
                  ,beginIp65504P2049S
                  ,IP_65504_P_2049_S_LEN
                 );
            localIp65504P2049SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2049SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2049S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2049S() {	 
			return (getShort(beginIp65504P2049S));
   	}
         int localIp65504P2049LCounter = -1;
         public boolean isIp65504P2049LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2049LCounter != sharedCounter;
            localIp65504P2049LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2049_L_LEN = 2;
  	/**
	 * serializeIp65504P2049L
	 */
	protected void serializeIp65504P2049L(short ip65504P2049L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2049L,IP_65504_P_2049_L_LEN)
                  ,beginIp65504P2049L
                  ,IP_65504_P_2049_L_LEN
                 );
            localIp65504P2049LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2049LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2049L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2049L() {	 
			return (getShort(beginIp65504P2049L));
   	}
         int localIp65504P2050SCounter = -1;
         public boolean isIp65504P2050SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2050SCounter != sharedCounter;
            localIp65504P2050SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2050_S_LEN = 2;
  	/**
	 * serializeIp65504P2050S
	 */
	protected void serializeIp65504P2050S(short ip65504P2050S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2050S,IP_65504_P_2050_S_LEN)
                  ,beginIp65504P2050S
                  ,IP_65504_P_2050_S_LEN
                 );
            localIp65504P2050SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2050SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2050S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2050S() {	 
			return (getShort(beginIp65504P2050S));
   	}
         int localIp65504P2050LCounter = -1;
         public boolean isIp65504P2050LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2050LCounter != sharedCounter;
            localIp65504P2050LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2050_L_LEN = 2;
  	/**
	 * serializeIp65504P2050L
	 */
	protected void serializeIp65504P2050L(short ip65504P2050L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2050L,IP_65504_P_2050_L_LEN)
                  ,beginIp65504P2050L
                  ,IP_65504_P_2050_L_LEN
                 );
            localIp65504P2050LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2050LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2050L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2050L() {	 
			return (getShort(beginIp65504P2050L));
   	}
         int localIp65504P2051SCounter = -1;
         public boolean isIp65504P2051SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2051SCounter != sharedCounter;
            localIp65504P2051SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2051_S_LEN = 2;
  	/**
	 * serializeIp65504P2051S
	 */
	protected void serializeIp65504P2051S(short ip65504P2051S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2051S,IP_65504_P_2051_S_LEN)
                  ,beginIp65504P2051S
                  ,IP_65504_P_2051_S_LEN
                 );
            localIp65504P2051SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2051SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2051S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2051S() {	 
			return (getShort(beginIp65504P2051S));
   	}
         int localIp65504P2051LCounter = -1;
         public boolean isIp65504P2051LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2051LCounter != sharedCounter;
            localIp65504P2051LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2051_L_LEN = 2;
  	/**
	 * serializeIp65504P2051L
	 */
	protected void serializeIp65504P2051L(short ip65504P2051L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2051L,IP_65504_P_2051_L_LEN)
                  ,beginIp65504P2051L
                  ,IP_65504_P_2051_L_LEN
                 );
            localIp65504P2051LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2051LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2051L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2051L() {	 
			return (getShort(beginIp65504P2051L));
   	}
         int localIp65504P2052SCounter = -1;
         public boolean isIp65504P2052SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2052SCounter != sharedCounter;
            localIp65504P2052SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2052_S_LEN = 2;
  	/**
	 * serializeIp65504P2052S
	 */
	protected void serializeIp65504P2052S(short ip65504P2052S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2052S,IP_65504_P_2052_S_LEN)
                  ,beginIp65504P2052S
                  ,IP_65504_P_2052_S_LEN
                 );
            localIp65504P2052SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2052SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2052S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2052S() {	 
			return (getShort(beginIp65504P2052S));
   	}
         int localIp65504P2052LCounter = -1;
         public boolean isIp65504P2052LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2052LCounter != sharedCounter;
            localIp65504P2052LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2052_L_LEN = 2;
  	/**
	 * serializeIp65504P2052L
	 */
	protected void serializeIp65504P2052L(short ip65504P2052L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2052L,IP_65504_P_2052_L_LEN)
                  ,beginIp65504P2052L
                  ,IP_65504_P_2052_L_LEN
                 );
            localIp65504P2052LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2052LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2052L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2052L() {	 
			return (getShort(beginIp65504P2052L));
   	}
         int localIp65504P2053SCounter = -1;
         public boolean isIp65504P2053SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2053SCounter != sharedCounter;
            localIp65504P2053SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2053_S_LEN = 2;
  	/**
	 * serializeIp65504P2053S
	 */
	protected void serializeIp65504P2053S(short ip65504P2053S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2053S,IP_65504_P_2053_S_LEN)
                  ,beginIp65504P2053S
                  ,IP_65504_P_2053_S_LEN
                 );
            localIp65504P2053SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2053SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2053S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2053S() {	 
			return (getShort(beginIp65504P2053S));
   	}
         int localIp65504P2053LCounter = -1;
         public boolean isIp65504P2053LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2053LCounter != sharedCounter;
            localIp65504P2053LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2053_L_LEN = 2;
  	/**
	 * serializeIp65504P2053L
	 */
	protected void serializeIp65504P2053L(short ip65504P2053L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2053L,IP_65504_P_2053_L_LEN)
                  ,beginIp65504P2053L
                  ,IP_65504_P_2053_L_LEN
                 );
            localIp65504P2053LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2053LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2053L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2053L() {	 
			return (getShort(beginIp65504P2053L));
   	}
         int localIp65504P2054SCounter = -1;
         public boolean isIp65504P2054SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2054SCounter != sharedCounter;
            localIp65504P2054SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2054_S_LEN = 2;
  	/**
	 * serializeIp65504P2054S
	 */
	protected void serializeIp65504P2054S(short ip65504P2054S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2054S,IP_65504_P_2054_S_LEN)
                  ,beginIp65504P2054S
                  ,IP_65504_P_2054_S_LEN
                 );
            localIp65504P2054SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2054SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2054S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2054S() {	 
			return (getShort(beginIp65504P2054S));
   	}
         int localIp65504P2054LCounter = -1;
         public boolean isIp65504P2054LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2054LCounter != sharedCounter;
            localIp65504P2054LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2054_L_LEN = 2;
  	/**
	 * serializeIp65504P2054L
	 */
	protected void serializeIp65504P2054L(short ip65504P2054L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2054L,IP_65504_P_2054_L_LEN)
                  ,beginIp65504P2054L
                  ,IP_65504_P_2054_L_LEN
                 );
            localIp65504P2054LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2054LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2054L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2054L() {	 
			return (getShort(beginIp65504P2054L));
   	}
         int localIp65504P2055SCounter = -1;
         public boolean isIp65504P2055SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2055SCounter != sharedCounter;
            localIp65504P2055SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2055_S_LEN = 2;
  	/**
	 * serializeIp65504P2055S
	 */
	protected void serializeIp65504P2055S(short ip65504P2055S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2055S,IP_65504_P_2055_S_LEN)
                  ,beginIp65504P2055S
                  ,IP_65504_P_2055_S_LEN
                 );
            localIp65504P2055SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2055SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2055S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2055S() {	 
			return (getShort(beginIp65504P2055S));
   	}
         int localIp65504P2055LCounter = -1;
         public boolean isIp65504P2055LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2055LCounter != sharedCounter;
            localIp65504P2055LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2055_L_LEN = 2;
  	/**
	 * serializeIp65504P2055L
	 */
	protected void serializeIp65504P2055L(short ip65504P2055L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2055L,IP_65504_P_2055_L_LEN)
                  ,beginIp65504P2055L
                  ,IP_65504_P_2055_L_LEN
                 );
            localIp65504P2055LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2055LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2055L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2055L() {	 
			return (getShort(beginIp65504P2055L));
   	}
         int localIp65504P2056SCounter = -1;
         public boolean isIp65504P2056SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2056SCounter != sharedCounter;
            localIp65504P2056SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2056_S_LEN = 2;
  	/**
	 * serializeIp65504P2056S
	 */
	protected void serializeIp65504P2056S(short ip65504P2056S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2056S,IP_65504_P_2056_S_LEN)
                  ,beginIp65504P2056S
                  ,IP_65504_P_2056_S_LEN
                 );
            localIp65504P2056SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2056SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2056S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2056S() {	 
			return (getShort(beginIp65504P2056S));
   	}
         int localIp65504P2056LCounter = -1;
         public boolean isIp65504P2056LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2056LCounter != sharedCounter;
            localIp65504P2056LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2056_L_LEN = 2;
  	/**
	 * serializeIp65504P2056L
	 */
	protected void serializeIp65504P2056L(short ip65504P2056L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2056L,IP_65504_P_2056_L_LEN)
                  ,beginIp65504P2056L
                  ,IP_65504_P_2056_L_LEN
                 );
            localIp65504P2056LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2056LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2056L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2056L() {	 
			return (getShort(beginIp65504P2056L));
   	}
         int localIp65504P2057SCounter = -1;
         public boolean isIp65504P2057SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2057SCounter != sharedCounter;
            localIp65504P2057SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2057_S_LEN = 2;
  	/**
	 * serializeIp65504P2057S
	 */
	protected void serializeIp65504P2057S(short ip65504P2057S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2057S,IP_65504_P_2057_S_LEN)
                  ,beginIp65504P2057S
                  ,IP_65504_P_2057_S_LEN
                 );
            localIp65504P2057SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2057SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2057S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2057S() {	 
			return (getShort(beginIp65504P2057S));
   	}
         int localIp65504P2057LCounter = -1;
         public boolean isIp65504P2057LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2057LCounter != sharedCounter;
            localIp65504P2057LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2057_L_LEN = 2;
  	/**
	 * serializeIp65504P2057L
	 */
	protected void serializeIp65504P2057L(short ip65504P2057L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2057L,IP_65504_P_2057_L_LEN)
                  ,beginIp65504P2057L
                  ,IP_65504_P_2057_L_LEN
                 );
            localIp65504P2057LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2057LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2057L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2057L() {	 
			return (getShort(beginIp65504P2057L));
   	}
         int localIp65504P2058SCounter = -1;
         public boolean isIp65504P2058SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2058SCounter != sharedCounter;
            localIp65504P2058SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2058_S_LEN = 2;
  	/**
	 * serializeIp65504P2058S
	 */
	protected void serializeIp65504P2058S(short ip65504P2058S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2058S,IP_65504_P_2058_S_LEN)
                  ,beginIp65504P2058S
                  ,IP_65504_P_2058_S_LEN
                 );
            localIp65504P2058SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2058SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2058S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2058S() {	 
			return (getShort(beginIp65504P2058S));
   	}
         int localIp65504P2058LCounter = -1;
         public boolean isIp65504P2058LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2058LCounter != sharedCounter;
            localIp65504P2058LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2058_L_LEN = 2;
  	/**
	 * serializeIp65504P2058L
	 */
	protected void serializeIp65504P2058L(short ip65504P2058L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2058L,IP_65504_P_2058_L_LEN)
                  ,beginIp65504P2058L
                  ,IP_65504_P_2058_L_LEN
                 );
            localIp65504P2058LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2058LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2058L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2058L() {	 
			return (getShort(beginIp65504P2058L));
   	}
         int localIp65504P2059SCounter = -1;
         public boolean isIp65504P2059SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2059SCounter != sharedCounter;
            localIp65504P2059SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2059_S_LEN = 2;
  	/**
	 * serializeIp65504P2059S
	 */
	protected void serializeIp65504P2059S(short ip65504P2059S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2059S,IP_65504_P_2059_S_LEN)
                  ,beginIp65504P2059S
                  ,IP_65504_P_2059_S_LEN
                 );
            localIp65504P2059SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2059SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2059S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2059S() {	 
			return (getShort(beginIp65504P2059S));
   	}
         int localIp65504P2059LCounter = -1;
         public boolean isIp65504P2059LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2059LCounter != sharedCounter;
            localIp65504P2059LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2059_L_LEN = 2;
  	/**
	 * serializeIp65504P2059L
	 */
	protected void serializeIp65504P2059L(short ip65504P2059L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2059L,IP_65504_P_2059_L_LEN)
                  ,beginIp65504P2059L
                  ,IP_65504_P_2059_L_LEN
                 );
            localIp65504P2059LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2059LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2059L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2059L() {	 
			return (getShort(beginIp65504P2059L));
   	}
         int localIp65504P2060SCounter = -1;
         public boolean isIp65504P2060SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2060SCounter != sharedCounter;
            localIp65504P2060SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2060_S_LEN = 2;
  	/**
	 * serializeIp65504P2060S
	 */
	protected void serializeIp65504P2060S(short ip65504P2060S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2060S,IP_65504_P_2060_S_LEN)
                  ,beginIp65504P2060S
                  ,IP_65504_P_2060_S_LEN
                 );
            localIp65504P2060SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2060SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2060S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2060S() {	 
			return (getShort(beginIp65504P2060S));
   	}
         int localIp65504P2060LCounter = -1;
         public boolean isIp65504P2060LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2060LCounter != sharedCounter;
            localIp65504P2060LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2060_L_LEN = 2;
  	/**
	 * serializeIp65504P2060L
	 */
	protected void serializeIp65504P2060L(short ip65504P2060L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2060L,IP_65504_P_2060_L_LEN)
                  ,beginIp65504P2060L
                  ,IP_65504_P_2060_L_LEN
                 );
            localIp65504P2060LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2060LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2060L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2060L() {	 
			return (getShort(beginIp65504P2060L));
   	}
         int localIp65504P2061SCounter = -1;
         public boolean isIp65504P2061SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2061SCounter != sharedCounter;
            localIp65504P2061SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2061_S_LEN = 2;
  	/**
	 * serializeIp65504P2061S
	 */
	protected void serializeIp65504P2061S(short ip65504P2061S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2061S,IP_65504_P_2061_S_LEN)
                  ,beginIp65504P2061S
                  ,IP_65504_P_2061_S_LEN
                 );
            localIp65504P2061SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2061SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2061S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2061S() {	 
			return (getShort(beginIp65504P2061S));
   	}
         int localIp65504P2061LCounter = -1;
         public boolean isIp65504P2061LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2061LCounter != sharedCounter;
            localIp65504P2061LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2061_L_LEN = 2;
  	/**
	 * serializeIp65504P2061L
	 */
	protected void serializeIp65504P2061L(short ip65504P2061L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2061L,IP_65504_P_2061_L_LEN)
                  ,beginIp65504P2061L
                  ,IP_65504_P_2061_L_LEN
                 );
            localIp65504P2061LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2061LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2061L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2061L() {	 
			return (getShort(beginIp65504P2061L));
   	}
         int localIp65504P2062SCounter = -1;
         public boolean isIp65504P2062SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2062SCounter != sharedCounter;
            localIp65504P2062SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2062_S_LEN = 2;
  	/**
	 * serializeIp65504P2062S
	 */
	protected void serializeIp65504P2062S(short ip65504P2062S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2062S,IP_65504_P_2062_S_LEN)
                  ,beginIp65504P2062S
                  ,IP_65504_P_2062_S_LEN
                 );
            localIp65504P2062SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2062SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2062S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2062S() {	 
			return (getShort(beginIp65504P2062S));
   	}
         int localIp65504P2062LCounter = -1;
         public boolean isIp65504P2062LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2062LCounter != sharedCounter;
            localIp65504P2062LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2062_L_LEN = 2;
  	/**
	 * serializeIp65504P2062L
	 */
	protected void serializeIp65504P2062L(short ip65504P2062L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2062L,IP_65504_P_2062_L_LEN)
                  ,beginIp65504P2062L
                  ,IP_65504_P_2062_L_LEN
                 );
            localIp65504P2062LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2062LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2062L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2062L() {	 
			return (getShort(beginIp65504P2062L));
   	}
         int localIp65504P2063SCounter = -1;
         public boolean isIp65504P2063SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2063SCounter != sharedCounter;
            localIp65504P2063SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2063_S_LEN = 2;
  	/**
	 * serializeIp65504P2063S
	 */
	protected void serializeIp65504P2063S(short ip65504P2063S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2063S,IP_65504_P_2063_S_LEN)
                  ,beginIp65504P2063S
                  ,IP_65504_P_2063_S_LEN
                 );
            localIp65504P2063SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2063SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2063S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2063S() {	 
			return (getShort(beginIp65504P2063S));
   	}
         int localIp65504P2063LCounter = -1;
         public boolean isIp65504P2063LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2063LCounter != sharedCounter;
            localIp65504P2063LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2063_L_LEN = 2;
  	/**
	 * serializeIp65504P2063L
	 */
	protected void serializeIp65504P2063L(short ip65504P2063L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2063L,IP_65504_P_2063_L_LEN)
                  ,beginIp65504P2063L
                  ,IP_65504_P_2063_L_LEN
                 );
            localIp65504P2063LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2063LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2063L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2063L() {	 
			return (getShort(beginIp65504P2063L));
   	}
         int localIp65504P2064SCounter = -1;
         public boolean isIp65504P2064SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2064SCounter != sharedCounter;
            localIp65504P2064SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2064_S_LEN = 2;
  	/**
	 * serializeIp65504P2064S
	 */
	protected void serializeIp65504P2064S(short ip65504P2064S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2064S,IP_65504_P_2064_S_LEN)
                  ,beginIp65504P2064S
                  ,IP_65504_P_2064_S_LEN
                 );
            localIp65504P2064SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2064SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2064S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2064S() {	 
			return (getShort(beginIp65504P2064S));
   	}
         int localIp65504P2064LCounter = -1;
         public boolean isIp65504P2064LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2064LCounter != sharedCounter;
            localIp65504P2064LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2064_L_LEN = 2;
  	/**
	 * serializeIp65504P2064L
	 */
	protected void serializeIp65504P2064L(short ip65504P2064L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2064L,IP_65504_P_2064_L_LEN)
                  ,beginIp65504P2064L
                  ,IP_65504_P_2064_L_LEN
                 );
            localIp65504P2064LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2064LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2064L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2064L() {	 
			return (getShort(beginIp65504P2064L));
   	}
         int localIp65504P2065SCounter = -1;
         public boolean isIp65504P2065SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2065SCounter != sharedCounter;
            localIp65504P2065SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2065_S_LEN = 2;
  	/**
	 * serializeIp65504P2065S
	 */
	protected void serializeIp65504P2065S(short ip65504P2065S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2065S,IP_65504_P_2065_S_LEN)
                  ,beginIp65504P2065S
                  ,IP_65504_P_2065_S_LEN
                 );
            localIp65504P2065SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2065SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2065S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2065S() {	 
			return (getShort(beginIp65504P2065S));
   	}
         int localIp65504P2065LCounter = -1;
         public boolean isIp65504P2065LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2065LCounter != sharedCounter;
            localIp65504P2065LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2065_L_LEN = 2;
  	/**
	 * serializeIp65504P2065L
	 */
	protected void serializeIp65504P2065L(short ip65504P2065L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2065L,IP_65504_P_2065_L_LEN)
                  ,beginIp65504P2065L
                  ,IP_65504_P_2065_L_LEN
                 );
            localIp65504P2065LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2065LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2065L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2065L() {	 
			return (getShort(beginIp65504P2065L));
   	}
         int localIp65504P2066SCounter = -1;
         public boolean isIp65504P2066SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2066SCounter != sharedCounter;
            localIp65504P2066SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2066_S_LEN = 2;
  	/**
	 * serializeIp65504P2066S
	 */
	protected void serializeIp65504P2066S(short ip65504P2066S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2066S,IP_65504_P_2066_S_LEN)
                  ,beginIp65504P2066S
                  ,IP_65504_P_2066_S_LEN
                 );
            localIp65504P2066SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2066SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2066S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2066S() {	 
			return (getShort(beginIp65504P2066S));
   	}
         int localIp65504P2066LCounter = -1;
         public boolean isIp65504P2066LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2066LCounter != sharedCounter;
            localIp65504P2066LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2066_L_LEN = 2;
  	/**
	 * serializeIp65504P2066L
	 */
	protected void serializeIp65504P2066L(short ip65504P2066L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2066L,IP_65504_P_2066_L_LEN)
                  ,beginIp65504P2066L
                  ,IP_65504_P_2066_L_LEN
                 );
            localIp65504P2066LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2066LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2066L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2066L() {	 
			return (getShort(beginIp65504P2066L));
   	}
         int localIp65504P2067SCounter = -1;
         public boolean isIp65504P2067SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2067SCounter != sharedCounter;
            localIp65504P2067SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2067_S_LEN = 2;
  	/**
	 * serializeIp65504P2067S
	 */
	protected void serializeIp65504P2067S(short ip65504P2067S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2067S,IP_65504_P_2067_S_LEN)
                  ,beginIp65504P2067S
                  ,IP_65504_P_2067_S_LEN
                 );
            localIp65504P2067SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2067SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2067S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2067S() {	 
			return (getShort(beginIp65504P2067S));
   	}
         int localIp65504P2067LCounter = -1;
         public boolean isIp65504P2067LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2067LCounter != sharedCounter;
            localIp65504P2067LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2067_L_LEN = 2;
  	/**
	 * serializeIp65504P2067L
	 */
	protected void serializeIp65504P2067L(short ip65504P2067L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2067L,IP_65504_P_2067_L_LEN)
                  ,beginIp65504P2067L
                  ,IP_65504_P_2067_L_LEN
                 );
            localIp65504P2067LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2067LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2067L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2067L() {	 
			return (getShort(beginIp65504P2067L));
   	}
         int localIp65504P2068SCounter = -1;
         public boolean isIp65504P2068SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2068SCounter != sharedCounter;
            localIp65504P2068SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2068_S_LEN = 2;
  	/**
	 * serializeIp65504P2068S
	 */
	protected void serializeIp65504P2068S(short ip65504P2068S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2068S,IP_65504_P_2068_S_LEN)
                  ,beginIp65504P2068S
                  ,IP_65504_P_2068_S_LEN
                 );
            localIp65504P2068SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2068SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2068S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2068S() {	 
			return (getShort(beginIp65504P2068S));
   	}
         int localIp65504P2068LCounter = -1;
         public boolean isIp65504P2068LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2068LCounter != sharedCounter;
            localIp65504P2068LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2068_L_LEN = 2;
  	/**
	 * serializeIp65504P2068L
	 */
	protected void serializeIp65504P2068L(short ip65504P2068L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2068L,IP_65504_P_2068_L_LEN)
                  ,beginIp65504P2068L
                  ,IP_65504_P_2068_L_LEN
                 );
            localIp65504P2068LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2068LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2068L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2068L() {	 
			return (getShort(beginIp65504P2068L));
   	}
         int localIp65504P2069SCounter = -1;
         public boolean isIp65504P2069SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2069SCounter != sharedCounter;
            localIp65504P2069SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2069_S_LEN = 2;
  	/**
	 * serializeIp65504P2069S
	 */
	protected void serializeIp65504P2069S(short ip65504P2069S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2069S,IP_65504_P_2069_S_LEN)
                  ,beginIp65504P2069S
                  ,IP_65504_P_2069_S_LEN
                 );
            localIp65504P2069SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2069SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2069S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2069S() {	 
			return (getShort(beginIp65504P2069S));
   	}
         int localIp65504P2069LCounter = -1;
         public boolean isIp65504P2069LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2069LCounter != sharedCounter;
            localIp65504P2069LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2069_L_LEN = 2;
  	/**
	 * serializeIp65504P2069L
	 */
	protected void serializeIp65504P2069L(short ip65504P2069L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2069L,IP_65504_P_2069_L_LEN)
                  ,beginIp65504P2069L
                  ,IP_65504_P_2069_L_LEN
                 );
            localIp65504P2069LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2069LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2069L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2069L() {	 
			return (getShort(beginIp65504P2069L));
   	}
         int localIp65504P2070SCounter = -1;
         public boolean isIp65504P2070SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2070SCounter != sharedCounter;
            localIp65504P2070SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2070_S_LEN = 2;
  	/**
	 * serializeIp65504P2070S
	 */
	protected void serializeIp65504P2070S(short ip65504P2070S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2070S,IP_65504_P_2070_S_LEN)
                  ,beginIp65504P2070S
                  ,IP_65504_P_2070_S_LEN
                 );
            localIp65504P2070SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2070SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2070S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2070S() {	 
			return (getShort(beginIp65504P2070S));
   	}
         int localIp65504P2070LCounter = -1;
         public boolean isIp65504P2070LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2070LCounter != sharedCounter;
            localIp65504P2070LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2070_L_LEN = 2;
  	/**
	 * serializeIp65504P2070L
	 */
	protected void serializeIp65504P2070L(short ip65504P2070L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2070L,IP_65504_P_2070_L_LEN)
                  ,beginIp65504P2070L
                  ,IP_65504_P_2070_L_LEN
                 );
            localIp65504P2070LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2070LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2070L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2070L() {	 
			return (getShort(beginIp65504P2070L));
   	}
         int localIp65504P2071SCounter = -1;
         public boolean isIp65504P2071SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2071SCounter != sharedCounter;
            localIp65504P2071SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2071_S_LEN = 2;
  	/**
	 * serializeIp65504P2071S
	 */
	protected void serializeIp65504P2071S(short ip65504P2071S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2071S,IP_65504_P_2071_S_LEN)
                  ,beginIp65504P2071S
                  ,IP_65504_P_2071_S_LEN
                 );
            localIp65504P2071SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2071SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2071S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2071S() {	 
			return (getShort(beginIp65504P2071S));
   	}
         int localIp65504P2071LCounter = -1;
         public boolean isIp65504P2071LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2071LCounter != sharedCounter;
            localIp65504P2071LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2071_L_LEN = 2;
  	/**
	 * serializeIp65504P2071L
	 */
	protected void serializeIp65504P2071L(short ip65504P2071L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2071L,IP_65504_P_2071_L_LEN)
                  ,beginIp65504P2071L
                  ,IP_65504_P_2071_L_LEN
                 );
            localIp65504P2071LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2071LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2071L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2071L() {	 
			return (getShort(beginIp65504P2071L));
   	}
         int localIp65504P2072SCounter = -1;
         public boolean isIp65504P2072SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2072SCounter != sharedCounter;
            localIp65504P2072SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2072_S_LEN = 2;
  	/**
	 * serializeIp65504P2072S
	 */
	protected void serializeIp65504P2072S(short ip65504P2072S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2072S,IP_65504_P_2072_S_LEN)
                  ,beginIp65504P2072S
                  ,IP_65504_P_2072_S_LEN
                 );
            localIp65504P2072SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2072SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2072S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2072S() {	 
			return (getShort(beginIp65504P2072S));
   	}
         int localIp65504P2072LCounter = -1;
         public boolean isIp65504P2072LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2072LCounter != sharedCounter;
            localIp65504P2072LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2072_L_LEN = 2;
  	/**
	 * serializeIp65504P2072L
	 */
	protected void serializeIp65504P2072L(short ip65504P2072L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2072L,IP_65504_P_2072_L_LEN)
                  ,beginIp65504P2072L
                  ,IP_65504_P_2072_L_LEN
                 );
            localIp65504P2072LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2072LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2072L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2072L() {	 
			return (getShort(beginIp65504P2072L));
   	}
         int localIp65504P2073SCounter = -1;
         public boolean isIp65504P2073SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2073SCounter != sharedCounter;
            localIp65504P2073SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2073_S_LEN = 2;
  	/**
	 * serializeIp65504P2073S
	 */
	protected void serializeIp65504P2073S(short ip65504P2073S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2073S,IP_65504_P_2073_S_LEN)
                  ,beginIp65504P2073S
                  ,IP_65504_P_2073_S_LEN
                 );
            localIp65504P2073SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2073SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2073S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2073S() {	 
			return (getShort(beginIp65504P2073S));
   	}
         int localIp65504P2073LCounter = -1;
         public boolean isIp65504P2073LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2073LCounter != sharedCounter;
            localIp65504P2073LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2073_L_LEN = 2;
  	/**
	 * serializeIp65504P2073L
	 */
	protected void serializeIp65504P2073L(short ip65504P2073L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2073L,IP_65504_P_2073_L_LEN)
                  ,beginIp65504P2073L
                  ,IP_65504_P_2073_L_LEN
                 );
            localIp65504P2073LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2073LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2073L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2073L() {	 
			return (getShort(beginIp65504P2073L));
   	}
         int localIp65504P2074SCounter = -1;
         public boolean isIp65504P2074SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2074SCounter != sharedCounter;
            localIp65504P2074SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2074_S_LEN = 2;
  	/**
	 * serializeIp65504P2074S
	 */
	protected void serializeIp65504P2074S(short ip65504P2074S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2074S,IP_65504_P_2074_S_LEN)
                  ,beginIp65504P2074S
                  ,IP_65504_P_2074_S_LEN
                 );
            localIp65504P2074SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2074SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2074S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2074S() {	 
			return (getShort(beginIp65504P2074S));
   	}
         int localIp65504P2074LCounter = -1;
         public boolean isIp65504P2074LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2074LCounter != sharedCounter;
            localIp65504P2074LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2074_L_LEN = 2;
  	/**
	 * serializeIp65504P2074L
	 */
	protected void serializeIp65504P2074L(short ip65504P2074L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2074L,IP_65504_P_2074_L_LEN)
                  ,beginIp65504P2074L
                  ,IP_65504_P_2074_L_LEN
                 );
            localIp65504P2074LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2074LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2074L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2074L() {	 
			return (getShort(beginIp65504P2074L));
   	}
         int localIp65504P2075SCounter = -1;
         public boolean isIp65504P2075SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2075SCounter != sharedCounter;
            localIp65504P2075SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2075_S_LEN = 2;
  	/**
	 * serializeIp65504P2075S
	 */
	protected void serializeIp65504P2075S(short ip65504P2075S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2075S,IP_65504_P_2075_S_LEN)
                  ,beginIp65504P2075S
                  ,IP_65504_P_2075_S_LEN
                 );
            localIp65504P2075SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2075SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2075S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2075S() {	 
			return (getShort(beginIp65504P2075S));
   	}
         int localIp65504P2075LCounter = -1;
         public boolean isIp65504P2075LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2075LCounter != sharedCounter;
            localIp65504P2075LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2075_L_LEN = 2;
  	/**
	 * serializeIp65504P2075L
	 */
	protected void serializeIp65504P2075L(short ip65504P2075L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2075L,IP_65504_P_2075_L_LEN)
                  ,beginIp65504P2075L
                  ,IP_65504_P_2075_L_LEN
                 );
            localIp65504P2075LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2075LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2075L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2075L() {	 
			return (getShort(beginIp65504P2075L));
   	}
         int localIp65504P2076SCounter = -1;
         public boolean isIp65504P2076SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2076SCounter != sharedCounter;
            localIp65504P2076SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2076_S_LEN = 2;
  	/**
	 * serializeIp65504P2076S
	 */
	protected void serializeIp65504P2076S(short ip65504P2076S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2076S,IP_65504_P_2076_S_LEN)
                  ,beginIp65504P2076S
                  ,IP_65504_P_2076_S_LEN
                 );
            localIp65504P2076SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2076SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2076S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2076S() {	 
			return (getShort(beginIp65504P2076S));
   	}
         int localIp65504P2076LCounter = -1;
         public boolean isIp65504P2076LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2076LCounter != sharedCounter;
            localIp65504P2076LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2076_L_LEN = 2;
  	/**
	 * serializeIp65504P2076L
	 */
	protected void serializeIp65504P2076L(short ip65504P2076L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2076L,IP_65504_P_2076_L_LEN)
                  ,beginIp65504P2076L
                  ,IP_65504_P_2076_L_LEN
                 );
            localIp65504P2076LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2076LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2076L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2076L() {	 
			return (getShort(beginIp65504P2076L));
   	}
         int localIp65504P2077SCounter = -1;
         public boolean isIp65504P2077SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2077SCounter != sharedCounter;
            localIp65504P2077SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2077_S_LEN = 2;
  	/**
	 * serializeIp65504P2077S
	 */
	protected void serializeIp65504P2077S(short ip65504P2077S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2077S,IP_65504_P_2077_S_LEN)
                  ,beginIp65504P2077S
                  ,IP_65504_P_2077_S_LEN
                 );
            localIp65504P2077SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2077SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2077S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2077S() {	 
			return (getShort(beginIp65504P2077S));
   	}
         int localIp65504P2077LCounter = -1;
         public boolean isIp65504P2077LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2077LCounter != sharedCounter;
            localIp65504P2077LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2077_L_LEN = 2;
  	/**
	 * serializeIp65504P2077L
	 */
	protected void serializeIp65504P2077L(short ip65504P2077L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2077L,IP_65504_P_2077_L_LEN)
                  ,beginIp65504P2077L
                  ,IP_65504_P_2077_L_LEN
                 );
            localIp65504P2077LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2077LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2077L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2077L() {	 
			return (getShort(beginIp65504P2077L));
   	}




}
  
