package com.cloudframe.app.bm8090m.dto;

/**
*  The class Section is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Section extends SectionSerialized {
   

								@Getter @Setter private int wIndxTitular;

								@Getter @Setter private int wTotTit;

						@Getter @Setter private char[] wPriTitu = Field.fillLowValue(60);

								@Getter @Setter private int wLonPriTitu;

						@Getter @Setter private char[] wSegTitu = Field.fillLowValue(60);

								@Getter @Setter private int wLonSegTitu;

						@Getter @Setter private char[] wTitCtaPe8090m = new char[100];

						@Getter @Setter private char[] wPriTroPe8090m = new char[50];

						@Getter @Setter private char[] wSegTroPe8090m = new char[50];

						@Getter @Setter private char[] wTitCtaAux = new char[100];

						@Getter @Setter private char[] wPriTroAux = new char[50];

						@Getter @Setter private char[] wSegTroAux = new char[50];
				@Getter @Setter private WTpePe8090m wTpePe8090m = new WTpePe8090m();
				@Getter @Setter private WTobPe8090m wTobPe8090m = new WTobPe8090m();
				@Getter @Setter private WDatVarPe8090m wDatVarPe8090m = new WDatVarPe8090m();
				@Getter @Setter private WZonAlmPe8090m wZonAlmPe8090m = new WZonAlmPe8090m();
				@Getter @Setter private WIniNomaPe8090m wIniNomaPe8090m = new WIniNomaPe8090m();
				@Getter @Setter private WIniNomrPe8090m wIniNomrPe8090m = new WIniNomrPe8090m();
				@Getter @Setter private WZonFpfPe8090m wZonFpfPe8090m = new WZonFpfPe8090m();
				@Getter @Setter private WAstPapPe8090m wAstPapPe8090m = new WAstPapPe8090m();
				@Getter @Setter private WAstJurPe8090m wAstJurPe8090m = new WAstJurPe8090m();

								@Getter @Setter private int wImpPe8090m;

						@Getter @Setter private char[] wTitulPe8090m = Field.fillLowValue(140);
				@Getter @Setter private WIniNomPe8090m wIniNomPe8090m = new WIniNomPe8090m();

								@Getter @Setter private int wNumPerFisPe8090m;
				@Getter @Setter private WMcas3Pe8090m wMcas3Pe8090m = new WMcas3Pe8090m();
				@Getter @Setter private WMcas3aPe8090m wMcas3aPe8090m = new WMcas3aPe8090m();
				@Getter @Setter private WMcas3bPe8090m wMcas3bPe8090m = new WMcas3bPe8090m();
				@Getter @Setter private WMcat3Pe8090m wMcat3Pe8090m = new WMcat3Pe8090m();
				@Getter @Setter private WMcat3aPe8090m wMcat3aPe8090m = new WMcat3aPe8090m();
				@Getter @Setter private WMcat3bPe8090m wMcat3bPe8090m = new WMcat3bPe8090m();
				@Getter @Setter private WMcas6Pe8090m wMcas6Pe8090m = new WMcas6Pe8090m();
				@Getter @Setter private WMcas6aPe8090m wMcas6aPe8090m = new WMcas6aPe8090m();
				@Getter @Setter private WMcas6bPe8090m wMcas6bPe8090m = new WMcas6bPe8090m();
				@Getter @Setter private WMcat6Pe8090m wMcat6Pe8090m = new WMcat6Pe8090m();
				@Getter @Setter private WMcat6aPe8090m wMcat6aPe8090m = new WMcat6aPe8090m();
				@Getter @Setter private WMcat6bPe8090m wMcat6bPe8090m = new WMcat6bPe8090m();
				@Getter @Setter private WMcas7Pe8090m wMcas7Pe8090m = new WMcas7Pe8090m();
				@Getter @Setter private WMcas7aPe8090m wMcas7aPe8090m = new WMcas7aPe8090m();
				@Getter @Setter private WMcas7bPe8090m wMcas7bPe8090m = new WMcas7bPe8090m();
				@Getter @Setter private WMcat7Pe8090m wMcat7Pe8090m = new WMcat7Pe8090m();
				@Getter @Setter private WMcat7aPe8090m wMcat7aPe8090m = new WMcat7aPe8090m();
				@Getter @Setter private WMcat7bPe8090m wMcat7bPe8090m = new WMcat7bPe8090m();
	
	/**
	* Constructor for Section
	**/
    public Section() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWTpePe8090m().setParent(this,getStartOffset() + 528);
					getWTobPe8090m().setParent(this,getStartOffset() + 2352);
					getWDatVarPe8090m().setParent(this,getStartOffset() + 2384);
					getWZonAlmPe8090m().setParent(this,getStartOffset() + 2408);
					getWIniNomaPe8090m().setParent(this,getStartOffset() + 2604);
					getWIniNomrPe8090m().setParent(this,getStartOffset() + 2604);
					getWZonFpfPe8090m().setParent(this,getStartOffset() + 2664);
					getWAstPapPe8090m().setParent(this,getStartOffset() + 2690);
					getWAstJurPe8090m().setParent(this,getStartOffset() + 2710);
					getWIniNomPe8090m().setParent(this,getStartOffset() + 2912);
					getWMcas3Pe8090m().setParent(this,getStartOffset() + 2934);
					getWMcas3aPe8090m().setParent(this,getStartOffset() + 2943);
					getWMcas3bPe8090m().setParent(this,getStartOffset() + 2953);
					getWMcat3Pe8090m().setParent(this,getStartOffset() + 2964);
					getWMcat3aPe8090m().setParent(this,getStartOffset() + 2973);
					getWMcat3bPe8090m().setParent(this,getStartOffset() + 2983);
					getWMcas6Pe8090m().setParent(this,getStartOffset() + 2994);
					getWMcas6aPe8090m().setParent(this,getStartOffset() + 3009);
					getWMcas6bPe8090m().setParent(this,getStartOffset() + 3025);
					getWMcat6Pe8090m().setParent(this,getStartOffset() + 3042);
					getWMcat6aPe8090m().setParent(this,getStartOffset() + 3057);
					getWMcat6bPe8090m().setParent(this,getStartOffset() + 3073);
					getWMcas7Pe8090m().setParent(this,getStartOffset() + 3090);
					getWMcas7aPe8090m().setParent(this,getStartOffset() + 3102);
					getWMcas7bPe8090m().setParent(this,getStartOffset() + 3115);
					getWMcat7Pe8090m().setParent(this,getStartOffset() + 3129);
					getWMcat7aPe8090m().setParent(this,getStartOffset() + 3141);
					getWMcat7bPe8090m().setParent(this,getStartOffset() + 3154);
	   	/*  end of offset */
								setWTitCtaPe8090m(pad(100," ".toCharArray(),' ',RIGHT_PAD));
								setWPriTroPe8090m(fillSpace(50));
								setWSegTroPe8090m(fillSpace(50));
								setWTitCtaAux(pad(100," ".toCharArray(),' ',RIGHT_PAD));
								setWPriTroAux(fillSpace(50));
								setWSegTroAux(fillSpace(50));
								setWImpPe8090m(0);
    }



	/**
	 * 	initializes Section
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWIndxTitular(0);
                     setWTotTit(0);
         setWPriTitu(CONSTANTS.SPACE_60);
                     setWLonPriTitu(0);
         setWSegTitu(CONSTANTS.SPACE_60);
                     setWLonSegTitu(0);
         setWTitCtaPe8090m(CONSTANTS.SPACE_100);
         setWPriTroPe8090m(CONSTANTS.SPACE_50);
         setWSegTroPe8090m(CONSTANTS.SPACE_50);
         setWTitCtaAux(CONSTANTS.SPACE_100);
         setWPriTroAux(CONSTANTS.SPACE_50);
         setWSegTroAux(CONSTANTS.SPACE_50);
          getWTpePe8090m().initialize();
     
          getWTobPe8090m().initialize();
     
          getWDatVarPe8090m().initialize();
     
          getWZonAlmPe8090m().initialize();
     
          getWIniNomaPe8090m().initialize();
     
          getWZonFpfPe8090m().initialize();
     
          getWAstPapPe8090m().initialize();
     
          getWAstJurPe8090m().initialize();
     
                     setWImpPe8090m(0);
         setWTitulPe8090m(CONSTANTS.SPACE_140);
          getWIniNomPe8090m().initialize();
     
                     setWNumPerFisPe8090m(0);
          getWMcas3Pe8090m().initialize();
     
          getWMcas3aPe8090m().initialize();
     
          getWMcas3bPe8090m().initialize();
     
          getWMcat3Pe8090m().initialize();
     
          getWMcat3aPe8090m().initialize();
     
          getWMcat3bPe8090m().initialize();
     
          getWMcas6Pe8090m().initialize();
     
          getWMcas6aPe8090m().initialize();
     
          getWMcas6bPe8090m().initialize();
     
          getWMcat6Pe8090m().initialize();
     
          getWMcat6aPe8090m().initialize();
     
          getWMcat6bPe8090m().initialize();
     
          getWMcas7Pe8090m().initialize();
     
          getWMcas7aPe8090m().initialize();
     
          getWMcas7bPe8090m().initialize();
     
          getWMcat7Pe8090m().initialize();
     
          getWMcat7aPe8090m().initialize();
     
          getWMcat7bPe8090m().initialize();
     
   }


}
  
