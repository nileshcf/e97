package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup76Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:16. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup76Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup76Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_76_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2326S;
            protected  int beginIp65504P2326L;
            protected  int beginIp65504P2327S;
            protected  int beginIp65504P2327L;
            protected  int beginIp65504P2328S;
            protected  int beginIp65504P2328L;
            protected  int beginIp65504P2329S;
            protected  int beginIp65504P2329L;
            protected  int beginIp65504P2330S;
            protected  int beginIp65504P2330L;
            protected  int beginIp65504P2331S;
            protected  int beginIp65504P2331L;
            protected  int beginIp65504P2332S;
            protected  int beginIp65504P2332L;
            protected  int beginIp65504P2333S;
            protected  int beginIp65504P2333L;
            protected  int beginIp65504P2334S;
            protected  int beginIp65504P2334L;
            protected  int beginIp65504P2335S;
            protected  int beginIp65504P2335L;
            protected  int beginIp65504P2336S;
            protected  int beginIp65504P2336L;
            protected  int beginIp65504P2337S;
            protected  int beginIp65504P2337L;
            protected  int beginIp65504P2338S;
            protected  int beginIp65504P2338L;
            protected  int beginIp65504P2339S;
            protected  int beginIp65504P2339L;
            protected  int beginIp65504P2340S;
            protected  int beginIp65504P2340L;
            protected  int beginIp65504P2341S;
            protected  int beginIp65504P2341L;
            protected  int beginIp65504P2342S;
            protected  int beginIp65504P2342L;
            protected  int beginIp65504P2343S;
            protected  int beginIp65504P2343L;
            protected  int beginIp65504P2344S;
            protected  int beginIp65504P2344L;
            protected  int beginIp65504P2345S;
            protected  int beginIp65504P2345L;
            protected  int beginIp65504P2346S;
            protected  int beginIp65504P2346L;
            protected  int beginIp65504P2347S;
            protected  int beginIp65504P2347L;
            protected  int beginIp65504P2348S;
            protected  int beginIp65504P2348L;
            protected  int beginIp65504P2349S;
            protected  int beginIp65504P2349L;
            protected  int beginIp65504P2350S;
            protected  int beginIp65504P2350L;
            protected  int beginIp65504P2351S;
            protected  int beginIp65504P2351L;
            protected  int beginIp65504P2352S;
            protected  int beginIp65504P2352L;
            protected  int beginIp65504P2353S;
            protected  int beginIp65504P2353L;
            protected  int beginIp65504P2354S;
            protected  int beginIp65504P2354L;
            protected  int beginIp65504P2355S;
            protected  int beginIp65504P2355L;
            protected  int beginIp65504P2356S;
            protected  int beginIp65504P2356L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup76Serialized
	**/
    public Ip65504PdsNamesLargeGroup76Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup76Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup76Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup76Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,18596); // serialize this field at offset 18596 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup76Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 18596 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup76Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_76_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2326S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2326L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2327S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2327L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2328S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2328L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2329S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2329L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2330S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2330L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2331S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2331L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2332S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2332L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2333S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2333L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2334S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2334L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2335S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2335L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2336S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2336L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2337S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2337L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2338S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2338L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2339S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2339L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2340S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2340L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2341S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2341L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2342S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2342L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2343S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2343L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2344S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2344L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2345S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2345L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2346S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2346L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2347S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2347L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2348S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2348L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2349S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2349L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2350S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2350L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2351S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2351L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2352S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2352L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2353S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2353L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2354S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2354L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2355S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2355L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2356S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2356L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2326SCounter = -1;
         public boolean isIp65504P2326SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2326SCounter != sharedCounter;
            localIp65504P2326SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2326_S_LEN = 2;
  	/**
	 * serializeIp65504P2326S
	 */
	protected void serializeIp65504P2326S(short ip65504P2326S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2326S,IP_65504_P_2326_S_LEN)
                  ,beginIp65504P2326S
                  ,IP_65504_P_2326_S_LEN
                 );
            localIp65504P2326SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2326SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2326S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2326S() {	 
			return (getShort(beginIp65504P2326S));
   	}
         int localIp65504P2326LCounter = -1;
         public boolean isIp65504P2326LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2326LCounter != sharedCounter;
            localIp65504P2326LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2326_L_LEN = 2;
  	/**
	 * serializeIp65504P2326L
	 */
	protected void serializeIp65504P2326L(short ip65504P2326L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2326L,IP_65504_P_2326_L_LEN)
                  ,beginIp65504P2326L
                  ,IP_65504_P_2326_L_LEN
                 );
            localIp65504P2326LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2326LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2326L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2326L() {	 
			return (getShort(beginIp65504P2326L));
   	}
         int localIp65504P2327SCounter = -1;
         public boolean isIp65504P2327SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2327SCounter != sharedCounter;
            localIp65504P2327SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2327_S_LEN = 2;
  	/**
	 * serializeIp65504P2327S
	 */
	protected void serializeIp65504P2327S(short ip65504P2327S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2327S,IP_65504_P_2327_S_LEN)
                  ,beginIp65504P2327S
                  ,IP_65504_P_2327_S_LEN
                 );
            localIp65504P2327SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2327SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2327S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2327S() {	 
			return (getShort(beginIp65504P2327S));
   	}
         int localIp65504P2327LCounter = -1;
         public boolean isIp65504P2327LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2327LCounter != sharedCounter;
            localIp65504P2327LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2327_L_LEN = 2;
  	/**
	 * serializeIp65504P2327L
	 */
	protected void serializeIp65504P2327L(short ip65504P2327L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2327L,IP_65504_P_2327_L_LEN)
                  ,beginIp65504P2327L
                  ,IP_65504_P_2327_L_LEN
                 );
            localIp65504P2327LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2327LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2327L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2327L() {	 
			return (getShort(beginIp65504P2327L));
   	}
         int localIp65504P2328SCounter = -1;
         public boolean isIp65504P2328SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2328SCounter != sharedCounter;
            localIp65504P2328SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2328_S_LEN = 2;
  	/**
	 * serializeIp65504P2328S
	 */
	protected void serializeIp65504P2328S(short ip65504P2328S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2328S,IP_65504_P_2328_S_LEN)
                  ,beginIp65504P2328S
                  ,IP_65504_P_2328_S_LEN
                 );
            localIp65504P2328SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2328SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2328S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2328S() {	 
			return (getShort(beginIp65504P2328S));
   	}
         int localIp65504P2328LCounter = -1;
         public boolean isIp65504P2328LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2328LCounter != sharedCounter;
            localIp65504P2328LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2328_L_LEN = 2;
  	/**
	 * serializeIp65504P2328L
	 */
	protected void serializeIp65504P2328L(short ip65504P2328L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2328L,IP_65504_P_2328_L_LEN)
                  ,beginIp65504P2328L
                  ,IP_65504_P_2328_L_LEN
                 );
            localIp65504P2328LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2328LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2328L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2328L() {	 
			return (getShort(beginIp65504P2328L));
   	}
         int localIp65504P2329SCounter = -1;
         public boolean isIp65504P2329SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2329SCounter != sharedCounter;
            localIp65504P2329SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2329_S_LEN = 2;
  	/**
	 * serializeIp65504P2329S
	 */
	protected void serializeIp65504P2329S(short ip65504P2329S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2329S,IP_65504_P_2329_S_LEN)
                  ,beginIp65504P2329S
                  ,IP_65504_P_2329_S_LEN
                 );
            localIp65504P2329SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2329SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2329S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2329S() {	 
			return (getShort(beginIp65504P2329S));
   	}
         int localIp65504P2329LCounter = -1;
         public boolean isIp65504P2329LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2329LCounter != sharedCounter;
            localIp65504P2329LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2329_L_LEN = 2;
  	/**
	 * serializeIp65504P2329L
	 */
	protected void serializeIp65504P2329L(short ip65504P2329L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2329L,IP_65504_P_2329_L_LEN)
                  ,beginIp65504P2329L
                  ,IP_65504_P_2329_L_LEN
                 );
            localIp65504P2329LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2329LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2329L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2329L() {	 
			return (getShort(beginIp65504P2329L));
   	}
         int localIp65504P2330SCounter = -1;
         public boolean isIp65504P2330SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2330SCounter != sharedCounter;
            localIp65504P2330SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2330_S_LEN = 2;
  	/**
	 * serializeIp65504P2330S
	 */
	protected void serializeIp65504P2330S(short ip65504P2330S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2330S,IP_65504_P_2330_S_LEN)
                  ,beginIp65504P2330S
                  ,IP_65504_P_2330_S_LEN
                 );
            localIp65504P2330SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2330SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2330S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2330S() {	 
			return (getShort(beginIp65504P2330S));
   	}
         int localIp65504P2330LCounter = -1;
         public boolean isIp65504P2330LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2330LCounter != sharedCounter;
            localIp65504P2330LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2330_L_LEN = 2;
  	/**
	 * serializeIp65504P2330L
	 */
	protected void serializeIp65504P2330L(short ip65504P2330L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2330L,IP_65504_P_2330_L_LEN)
                  ,beginIp65504P2330L
                  ,IP_65504_P_2330_L_LEN
                 );
            localIp65504P2330LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2330LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2330L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2330L() {	 
			return (getShort(beginIp65504P2330L));
   	}
         int localIp65504P2331SCounter = -1;
         public boolean isIp65504P2331SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2331SCounter != sharedCounter;
            localIp65504P2331SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2331_S_LEN = 2;
  	/**
	 * serializeIp65504P2331S
	 */
	protected void serializeIp65504P2331S(short ip65504P2331S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2331S,IP_65504_P_2331_S_LEN)
                  ,beginIp65504P2331S
                  ,IP_65504_P_2331_S_LEN
                 );
            localIp65504P2331SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2331SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2331S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2331S() {	 
			return (getShort(beginIp65504P2331S));
   	}
         int localIp65504P2331LCounter = -1;
         public boolean isIp65504P2331LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2331LCounter != sharedCounter;
            localIp65504P2331LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2331_L_LEN = 2;
  	/**
	 * serializeIp65504P2331L
	 */
	protected void serializeIp65504P2331L(short ip65504P2331L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2331L,IP_65504_P_2331_L_LEN)
                  ,beginIp65504P2331L
                  ,IP_65504_P_2331_L_LEN
                 );
            localIp65504P2331LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2331LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2331L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2331L() {	 
			return (getShort(beginIp65504P2331L));
   	}
         int localIp65504P2332SCounter = -1;
         public boolean isIp65504P2332SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2332SCounter != sharedCounter;
            localIp65504P2332SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2332_S_LEN = 2;
  	/**
	 * serializeIp65504P2332S
	 */
	protected void serializeIp65504P2332S(short ip65504P2332S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2332S,IP_65504_P_2332_S_LEN)
                  ,beginIp65504P2332S
                  ,IP_65504_P_2332_S_LEN
                 );
            localIp65504P2332SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2332SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2332S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2332S() {	 
			return (getShort(beginIp65504P2332S));
   	}
         int localIp65504P2332LCounter = -1;
         public boolean isIp65504P2332LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2332LCounter != sharedCounter;
            localIp65504P2332LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2332_L_LEN = 2;
  	/**
	 * serializeIp65504P2332L
	 */
	protected void serializeIp65504P2332L(short ip65504P2332L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2332L,IP_65504_P_2332_L_LEN)
                  ,beginIp65504P2332L
                  ,IP_65504_P_2332_L_LEN
                 );
            localIp65504P2332LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2332LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2332L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2332L() {	 
			return (getShort(beginIp65504P2332L));
   	}
         int localIp65504P2333SCounter = -1;
         public boolean isIp65504P2333SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2333SCounter != sharedCounter;
            localIp65504P2333SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2333_S_LEN = 2;
  	/**
	 * serializeIp65504P2333S
	 */
	protected void serializeIp65504P2333S(short ip65504P2333S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2333S,IP_65504_P_2333_S_LEN)
                  ,beginIp65504P2333S
                  ,IP_65504_P_2333_S_LEN
                 );
            localIp65504P2333SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2333SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2333S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2333S() {	 
			return (getShort(beginIp65504P2333S));
   	}
         int localIp65504P2333LCounter = -1;
         public boolean isIp65504P2333LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2333LCounter != sharedCounter;
            localIp65504P2333LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2333_L_LEN = 2;
  	/**
	 * serializeIp65504P2333L
	 */
	protected void serializeIp65504P2333L(short ip65504P2333L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2333L,IP_65504_P_2333_L_LEN)
                  ,beginIp65504P2333L
                  ,IP_65504_P_2333_L_LEN
                 );
            localIp65504P2333LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2333LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2333L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2333L() {	 
			return (getShort(beginIp65504P2333L));
   	}
         int localIp65504P2334SCounter = -1;
         public boolean isIp65504P2334SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2334SCounter != sharedCounter;
            localIp65504P2334SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2334_S_LEN = 2;
  	/**
	 * serializeIp65504P2334S
	 */
	protected void serializeIp65504P2334S(short ip65504P2334S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2334S,IP_65504_P_2334_S_LEN)
                  ,beginIp65504P2334S
                  ,IP_65504_P_2334_S_LEN
                 );
            localIp65504P2334SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2334SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2334S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2334S() {	 
			return (getShort(beginIp65504P2334S));
   	}
         int localIp65504P2334LCounter = -1;
         public boolean isIp65504P2334LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2334LCounter != sharedCounter;
            localIp65504P2334LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2334_L_LEN = 2;
  	/**
	 * serializeIp65504P2334L
	 */
	protected void serializeIp65504P2334L(short ip65504P2334L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2334L,IP_65504_P_2334_L_LEN)
                  ,beginIp65504P2334L
                  ,IP_65504_P_2334_L_LEN
                 );
            localIp65504P2334LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2334LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2334L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2334L() {	 
			return (getShort(beginIp65504P2334L));
   	}
         int localIp65504P2335SCounter = -1;
         public boolean isIp65504P2335SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2335SCounter != sharedCounter;
            localIp65504P2335SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2335_S_LEN = 2;
  	/**
	 * serializeIp65504P2335S
	 */
	protected void serializeIp65504P2335S(short ip65504P2335S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2335S,IP_65504_P_2335_S_LEN)
                  ,beginIp65504P2335S
                  ,IP_65504_P_2335_S_LEN
                 );
            localIp65504P2335SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2335SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2335S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2335S() {	 
			return (getShort(beginIp65504P2335S));
   	}
         int localIp65504P2335LCounter = -1;
         public boolean isIp65504P2335LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2335LCounter != sharedCounter;
            localIp65504P2335LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2335_L_LEN = 2;
  	/**
	 * serializeIp65504P2335L
	 */
	protected void serializeIp65504P2335L(short ip65504P2335L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2335L,IP_65504_P_2335_L_LEN)
                  ,beginIp65504P2335L
                  ,IP_65504_P_2335_L_LEN
                 );
            localIp65504P2335LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2335LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2335L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2335L() {	 
			return (getShort(beginIp65504P2335L));
   	}
         int localIp65504P2336SCounter = -1;
         public boolean isIp65504P2336SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2336SCounter != sharedCounter;
            localIp65504P2336SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2336_S_LEN = 2;
  	/**
	 * serializeIp65504P2336S
	 */
	protected void serializeIp65504P2336S(short ip65504P2336S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2336S,IP_65504_P_2336_S_LEN)
                  ,beginIp65504P2336S
                  ,IP_65504_P_2336_S_LEN
                 );
            localIp65504P2336SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2336SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2336S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2336S() {	 
			return (getShort(beginIp65504P2336S));
   	}
         int localIp65504P2336LCounter = -1;
         public boolean isIp65504P2336LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2336LCounter != sharedCounter;
            localIp65504P2336LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2336_L_LEN = 2;
  	/**
	 * serializeIp65504P2336L
	 */
	protected void serializeIp65504P2336L(short ip65504P2336L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2336L,IP_65504_P_2336_L_LEN)
                  ,beginIp65504P2336L
                  ,IP_65504_P_2336_L_LEN
                 );
            localIp65504P2336LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2336LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2336L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2336L() {	 
			return (getShort(beginIp65504P2336L));
   	}
         int localIp65504P2337SCounter = -1;
         public boolean isIp65504P2337SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2337SCounter != sharedCounter;
            localIp65504P2337SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2337_S_LEN = 2;
  	/**
	 * serializeIp65504P2337S
	 */
	protected void serializeIp65504P2337S(short ip65504P2337S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2337S,IP_65504_P_2337_S_LEN)
                  ,beginIp65504P2337S
                  ,IP_65504_P_2337_S_LEN
                 );
            localIp65504P2337SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2337SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2337S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2337S() {	 
			return (getShort(beginIp65504P2337S));
   	}
         int localIp65504P2337LCounter = -1;
         public boolean isIp65504P2337LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2337LCounter != sharedCounter;
            localIp65504P2337LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2337_L_LEN = 2;
  	/**
	 * serializeIp65504P2337L
	 */
	protected void serializeIp65504P2337L(short ip65504P2337L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2337L,IP_65504_P_2337_L_LEN)
                  ,beginIp65504P2337L
                  ,IP_65504_P_2337_L_LEN
                 );
            localIp65504P2337LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2337LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2337L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2337L() {	 
			return (getShort(beginIp65504P2337L));
   	}
         int localIp65504P2338SCounter = -1;
         public boolean isIp65504P2338SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2338SCounter != sharedCounter;
            localIp65504P2338SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2338_S_LEN = 2;
  	/**
	 * serializeIp65504P2338S
	 */
	protected void serializeIp65504P2338S(short ip65504P2338S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2338S,IP_65504_P_2338_S_LEN)
                  ,beginIp65504P2338S
                  ,IP_65504_P_2338_S_LEN
                 );
            localIp65504P2338SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2338SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2338S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2338S() {	 
			return (getShort(beginIp65504P2338S));
   	}
         int localIp65504P2338LCounter = -1;
         public boolean isIp65504P2338LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2338LCounter != sharedCounter;
            localIp65504P2338LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2338_L_LEN = 2;
  	/**
	 * serializeIp65504P2338L
	 */
	protected void serializeIp65504P2338L(short ip65504P2338L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2338L,IP_65504_P_2338_L_LEN)
                  ,beginIp65504P2338L
                  ,IP_65504_P_2338_L_LEN
                 );
            localIp65504P2338LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2338LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2338L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2338L() {	 
			return (getShort(beginIp65504P2338L));
   	}
         int localIp65504P2339SCounter = -1;
         public boolean isIp65504P2339SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2339SCounter != sharedCounter;
            localIp65504P2339SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2339_S_LEN = 2;
  	/**
	 * serializeIp65504P2339S
	 */
	protected void serializeIp65504P2339S(short ip65504P2339S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2339S,IP_65504_P_2339_S_LEN)
                  ,beginIp65504P2339S
                  ,IP_65504_P_2339_S_LEN
                 );
            localIp65504P2339SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2339SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2339S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2339S() {	 
			return (getShort(beginIp65504P2339S));
   	}
         int localIp65504P2339LCounter = -1;
         public boolean isIp65504P2339LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2339LCounter != sharedCounter;
            localIp65504P2339LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2339_L_LEN = 2;
  	/**
	 * serializeIp65504P2339L
	 */
	protected void serializeIp65504P2339L(short ip65504P2339L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2339L,IP_65504_P_2339_L_LEN)
                  ,beginIp65504P2339L
                  ,IP_65504_P_2339_L_LEN
                 );
            localIp65504P2339LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2339LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2339L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2339L() {	 
			return (getShort(beginIp65504P2339L));
   	}
         int localIp65504P2340SCounter = -1;
         public boolean isIp65504P2340SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2340SCounter != sharedCounter;
            localIp65504P2340SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2340_S_LEN = 2;
  	/**
	 * serializeIp65504P2340S
	 */
	protected void serializeIp65504P2340S(short ip65504P2340S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2340S,IP_65504_P_2340_S_LEN)
                  ,beginIp65504P2340S
                  ,IP_65504_P_2340_S_LEN
                 );
            localIp65504P2340SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2340SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2340S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2340S() {	 
			return (getShort(beginIp65504P2340S));
   	}
         int localIp65504P2340LCounter = -1;
         public boolean isIp65504P2340LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2340LCounter != sharedCounter;
            localIp65504P2340LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2340_L_LEN = 2;
  	/**
	 * serializeIp65504P2340L
	 */
	protected void serializeIp65504P2340L(short ip65504P2340L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2340L,IP_65504_P_2340_L_LEN)
                  ,beginIp65504P2340L
                  ,IP_65504_P_2340_L_LEN
                 );
            localIp65504P2340LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2340LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2340L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2340L() {	 
			return (getShort(beginIp65504P2340L));
   	}
         int localIp65504P2341SCounter = -1;
         public boolean isIp65504P2341SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2341SCounter != sharedCounter;
            localIp65504P2341SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2341_S_LEN = 2;
  	/**
	 * serializeIp65504P2341S
	 */
	protected void serializeIp65504P2341S(short ip65504P2341S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2341S,IP_65504_P_2341_S_LEN)
                  ,beginIp65504P2341S
                  ,IP_65504_P_2341_S_LEN
                 );
            localIp65504P2341SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2341SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2341S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2341S() {	 
			return (getShort(beginIp65504P2341S));
   	}
         int localIp65504P2341LCounter = -1;
         public boolean isIp65504P2341LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2341LCounter != sharedCounter;
            localIp65504P2341LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2341_L_LEN = 2;
  	/**
	 * serializeIp65504P2341L
	 */
	protected void serializeIp65504P2341L(short ip65504P2341L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2341L,IP_65504_P_2341_L_LEN)
                  ,beginIp65504P2341L
                  ,IP_65504_P_2341_L_LEN
                 );
            localIp65504P2341LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2341LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2341L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2341L() {	 
			return (getShort(beginIp65504P2341L));
   	}
         int localIp65504P2342SCounter = -1;
         public boolean isIp65504P2342SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2342SCounter != sharedCounter;
            localIp65504P2342SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2342_S_LEN = 2;
  	/**
	 * serializeIp65504P2342S
	 */
	protected void serializeIp65504P2342S(short ip65504P2342S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2342S,IP_65504_P_2342_S_LEN)
                  ,beginIp65504P2342S
                  ,IP_65504_P_2342_S_LEN
                 );
            localIp65504P2342SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2342SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2342S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2342S() {	 
			return (getShort(beginIp65504P2342S));
   	}
         int localIp65504P2342LCounter = -1;
         public boolean isIp65504P2342LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2342LCounter != sharedCounter;
            localIp65504P2342LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2342_L_LEN = 2;
  	/**
	 * serializeIp65504P2342L
	 */
	protected void serializeIp65504P2342L(short ip65504P2342L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2342L,IP_65504_P_2342_L_LEN)
                  ,beginIp65504P2342L
                  ,IP_65504_P_2342_L_LEN
                 );
            localIp65504P2342LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2342LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2342L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2342L() {	 
			return (getShort(beginIp65504P2342L));
   	}
         int localIp65504P2343SCounter = -1;
         public boolean isIp65504P2343SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2343SCounter != sharedCounter;
            localIp65504P2343SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2343_S_LEN = 2;
  	/**
	 * serializeIp65504P2343S
	 */
	protected void serializeIp65504P2343S(short ip65504P2343S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2343S,IP_65504_P_2343_S_LEN)
                  ,beginIp65504P2343S
                  ,IP_65504_P_2343_S_LEN
                 );
            localIp65504P2343SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2343SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2343S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2343S() {	 
			return (getShort(beginIp65504P2343S));
   	}
         int localIp65504P2343LCounter = -1;
         public boolean isIp65504P2343LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2343LCounter != sharedCounter;
            localIp65504P2343LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2343_L_LEN = 2;
  	/**
	 * serializeIp65504P2343L
	 */
	protected void serializeIp65504P2343L(short ip65504P2343L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2343L,IP_65504_P_2343_L_LEN)
                  ,beginIp65504P2343L
                  ,IP_65504_P_2343_L_LEN
                 );
            localIp65504P2343LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2343LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2343L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2343L() {	 
			return (getShort(beginIp65504P2343L));
   	}
         int localIp65504P2344SCounter = -1;
         public boolean isIp65504P2344SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2344SCounter != sharedCounter;
            localIp65504P2344SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2344_S_LEN = 2;
  	/**
	 * serializeIp65504P2344S
	 */
	protected void serializeIp65504P2344S(short ip65504P2344S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2344S,IP_65504_P_2344_S_LEN)
                  ,beginIp65504P2344S
                  ,IP_65504_P_2344_S_LEN
                 );
            localIp65504P2344SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2344SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2344S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2344S() {	 
			return (getShort(beginIp65504P2344S));
   	}
         int localIp65504P2344LCounter = -1;
         public boolean isIp65504P2344LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2344LCounter != sharedCounter;
            localIp65504P2344LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2344_L_LEN = 2;
  	/**
	 * serializeIp65504P2344L
	 */
	protected void serializeIp65504P2344L(short ip65504P2344L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2344L,IP_65504_P_2344_L_LEN)
                  ,beginIp65504P2344L
                  ,IP_65504_P_2344_L_LEN
                 );
            localIp65504P2344LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2344LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2344L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2344L() {	 
			return (getShort(beginIp65504P2344L));
   	}
         int localIp65504P2345SCounter = -1;
         public boolean isIp65504P2345SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2345SCounter != sharedCounter;
            localIp65504P2345SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2345_S_LEN = 2;
  	/**
	 * serializeIp65504P2345S
	 */
	protected void serializeIp65504P2345S(short ip65504P2345S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2345S,IP_65504_P_2345_S_LEN)
                  ,beginIp65504P2345S
                  ,IP_65504_P_2345_S_LEN
                 );
            localIp65504P2345SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2345SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2345S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2345S() {	 
			return (getShort(beginIp65504P2345S));
   	}
         int localIp65504P2345LCounter = -1;
         public boolean isIp65504P2345LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2345LCounter != sharedCounter;
            localIp65504P2345LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2345_L_LEN = 2;
  	/**
	 * serializeIp65504P2345L
	 */
	protected void serializeIp65504P2345L(short ip65504P2345L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2345L,IP_65504_P_2345_L_LEN)
                  ,beginIp65504P2345L
                  ,IP_65504_P_2345_L_LEN
                 );
            localIp65504P2345LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2345LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2345L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2345L() {	 
			return (getShort(beginIp65504P2345L));
   	}
         int localIp65504P2346SCounter = -1;
         public boolean isIp65504P2346SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2346SCounter != sharedCounter;
            localIp65504P2346SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2346_S_LEN = 2;
  	/**
	 * serializeIp65504P2346S
	 */
	protected void serializeIp65504P2346S(short ip65504P2346S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2346S,IP_65504_P_2346_S_LEN)
                  ,beginIp65504P2346S
                  ,IP_65504_P_2346_S_LEN
                 );
            localIp65504P2346SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2346SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2346S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2346S() {	 
			return (getShort(beginIp65504P2346S));
   	}
         int localIp65504P2346LCounter = -1;
         public boolean isIp65504P2346LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2346LCounter != sharedCounter;
            localIp65504P2346LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2346_L_LEN = 2;
  	/**
	 * serializeIp65504P2346L
	 */
	protected void serializeIp65504P2346L(short ip65504P2346L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2346L,IP_65504_P_2346_L_LEN)
                  ,beginIp65504P2346L
                  ,IP_65504_P_2346_L_LEN
                 );
            localIp65504P2346LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2346LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2346L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2346L() {	 
			return (getShort(beginIp65504P2346L));
   	}
         int localIp65504P2347SCounter = -1;
         public boolean isIp65504P2347SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2347SCounter != sharedCounter;
            localIp65504P2347SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2347_S_LEN = 2;
  	/**
	 * serializeIp65504P2347S
	 */
	protected void serializeIp65504P2347S(short ip65504P2347S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2347S,IP_65504_P_2347_S_LEN)
                  ,beginIp65504P2347S
                  ,IP_65504_P_2347_S_LEN
                 );
            localIp65504P2347SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2347SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2347S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2347S() {	 
			return (getShort(beginIp65504P2347S));
   	}
         int localIp65504P2347LCounter = -1;
         public boolean isIp65504P2347LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2347LCounter != sharedCounter;
            localIp65504P2347LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2347_L_LEN = 2;
  	/**
	 * serializeIp65504P2347L
	 */
	protected void serializeIp65504P2347L(short ip65504P2347L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2347L,IP_65504_P_2347_L_LEN)
                  ,beginIp65504P2347L
                  ,IP_65504_P_2347_L_LEN
                 );
            localIp65504P2347LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2347LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2347L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2347L() {	 
			return (getShort(beginIp65504P2347L));
   	}
         int localIp65504P2348SCounter = -1;
         public boolean isIp65504P2348SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2348SCounter != sharedCounter;
            localIp65504P2348SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2348_S_LEN = 2;
  	/**
	 * serializeIp65504P2348S
	 */
	protected void serializeIp65504P2348S(short ip65504P2348S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2348S,IP_65504_P_2348_S_LEN)
                  ,beginIp65504P2348S
                  ,IP_65504_P_2348_S_LEN
                 );
            localIp65504P2348SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2348SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2348S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2348S() {	 
			return (getShort(beginIp65504P2348S));
   	}
         int localIp65504P2348LCounter = -1;
         public boolean isIp65504P2348LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2348LCounter != sharedCounter;
            localIp65504P2348LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2348_L_LEN = 2;
  	/**
	 * serializeIp65504P2348L
	 */
	protected void serializeIp65504P2348L(short ip65504P2348L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2348L,IP_65504_P_2348_L_LEN)
                  ,beginIp65504P2348L
                  ,IP_65504_P_2348_L_LEN
                 );
            localIp65504P2348LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2348LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2348L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2348L() {	 
			return (getShort(beginIp65504P2348L));
   	}
         int localIp65504P2349SCounter = -1;
         public boolean isIp65504P2349SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2349SCounter != sharedCounter;
            localIp65504P2349SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2349_S_LEN = 2;
  	/**
	 * serializeIp65504P2349S
	 */
	protected void serializeIp65504P2349S(short ip65504P2349S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2349S,IP_65504_P_2349_S_LEN)
                  ,beginIp65504P2349S
                  ,IP_65504_P_2349_S_LEN
                 );
            localIp65504P2349SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2349SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2349S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2349S() {	 
			return (getShort(beginIp65504P2349S));
   	}
         int localIp65504P2349LCounter = -1;
         public boolean isIp65504P2349LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2349LCounter != sharedCounter;
            localIp65504P2349LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2349_L_LEN = 2;
  	/**
	 * serializeIp65504P2349L
	 */
	protected void serializeIp65504P2349L(short ip65504P2349L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2349L,IP_65504_P_2349_L_LEN)
                  ,beginIp65504P2349L
                  ,IP_65504_P_2349_L_LEN
                 );
            localIp65504P2349LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2349LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2349L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2349L() {	 
			return (getShort(beginIp65504P2349L));
   	}
         int localIp65504P2350SCounter = -1;
         public boolean isIp65504P2350SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2350SCounter != sharedCounter;
            localIp65504P2350SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2350_S_LEN = 2;
  	/**
	 * serializeIp65504P2350S
	 */
	protected void serializeIp65504P2350S(short ip65504P2350S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2350S,IP_65504_P_2350_S_LEN)
                  ,beginIp65504P2350S
                  ,IP_65504_P_2350_S_LEN
                 );
            localIp65504P2350SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2350SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2350S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2350S() {	 
			return (getShort(beginIp65504P2350S));
   	}
         int localIp65504P2350LCounter = -1;
         public boolean isIp65504P2350LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2350LCounter != sharedCounter;
            localIp65504P2350LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2350_L_LEN = 2;
  	/**
	 * serializeIp65504P2350L
	 */
	protected void serializeIp65504P2350L(short ip65504P2350L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2350L,IP_65504_P_2350_L_LEN)
                  ,beginIp65504P2350L
                  ,IP_65504_P_2350_L_LEN
                 );
            localIp65504P2350LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2350LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2350L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2350L() {	 
			return (getShort(beginIp65504P2350L));
   	}
         int localIp65504P2351SCounter = -1;
         public boolean isIp65504P2351SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2351SCounter != sharedCounter;
            localIp65504P2351SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2351_S_LEN = 2;
  	/**
	 * serializeIp65504P2351S
	 */
	protected void serializeIp65504P2351S(short ip65504P2351S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2351S,IP_65504_P_2351_S_LEN)
                  ,beginIp65504P2351S
                  ,IP_65504_P_2351_S_LEN
                 );
            localIp65504P2351SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2351SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2351S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2351S() {	 
			return (getShort(beginIp65504P2351S));
   	}
         int localIp65504P2351LCounter = -1;
         public boolean isIp65504P2351LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2351LCounter != sharedCounter;
            localIp65504P2351LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2351_L_LEN = 2;
  	/**
	 * serializeIp65504P2351L
	 */
	protected void serializeIp65504P2351L(short ip65504P2351L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2351L,IP_65504_P_2351_L_LEN)
                  ,beginIp65504P2351L
                  ,IP_65504_P_2351_L_LEN
                 );
            localIp65504P2351LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2351LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2351L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2351L() {	 
			return (getShort(beginIp65504P2351L));
   	}
         int localIp65504P2352SCounter = -1;
         public boolean isIp65504P2352SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2352SCounter != sharedCounter;
            localIp65504P2352SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2352_S_LEN = 2;
  	/**
	 * serializeIp65504P2352S
	 */
	protected void serializeIp65504P2352S(short ip65504P2352S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2352S,IP_65504_P_2352_S_LEN)
                  ,beginIp65504P2352S
                  ,IP_65504_P_2352_S_LEN
                 );
            localIp65504P2352SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2352SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2352S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2352S() {	 
			return (getShort(beginIp65504P2352S));
   	}
         int localIp65504P2352LCounter = -1;
         public boolean isIp65504P2352LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2352LCounter != sharedCounter;
            localIp65504P2352LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2352_L_LEN = 2;
  	/**
	 * serializeIp65504P2352L
	 */
	protected void serializeIp65504P2352L(short ip65504P2352L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2352L,IP_65504_P_2352_L_LEN)
                  ,beginIp65504P2352L
                  ,IP_65504_P_2352_L_LEN
                 );
            localIp65504P2352LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2352LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2352L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2352L() {	 
			return (getShort(beginIp65504P2352L));
   	}
         int localIp65504P2353SCounter = -1;
         public boolean isIp65504P2353SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2353SCounter != sharedCounter;
            localIp65504P2353SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2353_S_LEN = 2;
  	/**
	 * serializeIp65504P2353S
	 */
	protected void serializeIp65504P2353S(short ip65504P2353S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2353S,IP_65504_P_2353_S_LEN)
                  ,beginIp65504P2353S
                  ,IP_65504_P_2353_S_LEN
                 );
            localIp65504P2353SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2353SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2353S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2353S() {	 
			return (getShort(beginIp65504P2353S));
   	}
         int localIp65504P2353LCounter = -1;
         public boolean isIp65504P2353LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2353LCounter != sharedCounter;
            localIp65504P2353LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2353_L_LEN = 2;
  	/**
	 * serializeIp65504P2353L
	 */
	protected void serializeIp65504P2353L(short ip65504P2353L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2353L,IP_65504_P_2353_L_LEN)
                  ,beginIp65504P2353L
                  ,IP_65504_P_2353_L_LEN
                 );
            localIp65504P2353LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2353LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2353L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2353L() {	 
			return (getShort(beginIp65504P2353L));
   	}
         int localIp65504P2354SCounter = -1;
         public boolean isIp65504P2354SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2354SCounter != sharedCounter;
            localIp65504P2354SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2354_S_LEN = 2;
  	/**
	 * serializeIp65504P2354S
	 */
	protected void serializeIp65504P2354S(short ip65504P2354S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2354S,IP_65504_P_2354_S_LEN)
                  ,beginIp65504P2354S
                  ,IP_65504_P_2354_S_LEN
                 );
            localIp65504P2354SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2354SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2354S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2354S() {	 
			return (getShort(beginIp65504P2354S));
   	}
         int localIp65504P2354LCounter = -1;
         public boolean isIp65504P2354LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2354LCounter != sharedCounter;
            localIp65504P2354LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2354_L_LEN = 2;
  	/**
	 * serializeIp65504P2354L
	 */
	protected void serializeIp65504P2354L(short ip65504P2354L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2354L,IP_65504_P_2354_L_LEN)
                  ,beginIp65504P2354L
                  ,IP_65504_P_2354_L_LEN
                 );
            localIp65504P2354LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2354LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2354L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2354L() {	 
			return (getShort(beginIp65504P2354L));
   	}
         int localIp65504P2355SCounter = -1;
         public boolean isIp65504P2355SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2355SCounter != sharedCounter;
            localIp65504P2355SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2355_S_LEN = 2;
  	/**
	 * serializeIp65504P2355S
	 */
	protected void serializeIp65504P2355S(short ip65504P2355S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2355S,IP_65504_P_2355_S_LEN)
                  ,beginIp65504P2355S
                  ,IP_65504_P_2355_S_LEN
                 );
            localIp65504P2355SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2355SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2355S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2355S() {	 
			return (getShort(beginIp65504P2355S));
   	}
         int localIp65504P2355LCounter = -1;
         public boolean isIp65504P2355LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2355LCounter != sharedCounter;
            localIp65504P2355LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2355_L_LEN = 2;
  	/**
	 * serializeIp65504P2355L
	 */
	protected void serializeIp65504P2355L(short ip65504P2355L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2355L,IP_65504_P_2355_L_LEN)
                  ,beginIp65504P2355L
                  ,IP_65504_P_2355_L_LEN
                 );
            localIp65504P2355LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2355LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2355L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2355L() {	 
			return (getShort(beginIp65504P2355L));
   	}
         int localIp65504P2356SCounter = -1;
         public boolean isIp65504P2356SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2356SCounter != sharedCounter;
            localIp65504P2356SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2356_S_LEN = 2;
  	/**
	 * serializeIp65504P2356S
	 */
	protected void serializeIp65504P2356S(short ip65504P2356S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2356S,IP_65504_P_2356_S_LEN)
                  ,beginIp65504P2356S
                  ,IP_65504_P_2356_S_LEN
                 );
            localIp65504P2356SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2356SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2356S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2356S() {	 
			return (getShort(beginIp65504P2356S));
   	}
         int localIp65504P2356LCounter = -1;
         public boolean isIp65504P2356LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2356LCounter != sharedCounter;
            localIp65504P2356LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2356_L_LEN = 2;
  	/**
	 * serializeIp65504P2356L
	 */
	protected void serializeIp65504P2356L(short ip65504P2356L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2356L,IP_65504_P_2356_L_LEN)
                  ,beginIp65504P2356L
                  ,IP_65504_P_2356_L_LEN
                 );
            localIp65504P2356LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2356LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2356L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2356L() {	 
			return (getShort(beginIp65504P2356L));
   	}




}
  
