package com.cloudframe.app.bm8090m.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] wSwiInpUp1vez = Field.fillLowValue(1);

						@Getter @Setter private char[] wSwiInoUp1vez = Field.fillLowValue(1);

						@Getter @Setter private char[] wSwiInpDown1vez = Field.fillLowValue(1);

								@Getter @Setter private int wCntString;

								@Getter @Setter private int wIndOpc;

						@Getter @Setter private char[] wNomPer = Field.fillLowValue(60);

						@Getter @Setter private char[] wPapPer = Field.fillLowValue(100);

						@Getter @Setter private char[] wSapPer = Field.fillLowValue(60);

						@Getter @Setter private char[] wSepApe = Field.fillLowValue(1);

						@Getter @Setter private char[] wNomCom = Field.fillLowValue(60);

						@Getter @Setter private char[] wNomApe = Field.fillLowValue(40);

						@Getter @Setter private char[] wNomRed = Field.fillLowValue(24);

						@Getter @Setter private char[] wEsp1 = new char[1];

						@Getter @Setter private char[] wEsp2 = new char[2];

						@Getter @Setter private char[] wPunto = new char[1];

						@Getter @Setter private char[] wAster = new char[1];

						@Getter @Setter private char[] wnomPer01 = new char[22];

						@Getter @Setter private char[] wpapPer01 = new char[22];

						@Getter @Setter private char[] wsapPer01 = new char[22];

								@Getter @Setter private int llaTroParti;

								@Getter @Setter private int numCarParti;

						@Getter @Setter private char[] nomP01Parti = Field.fillLowValue(50);

						@Getter @Setter private char[] nomP02Parti = Field.fillLowValue(50);

								@Getter @Setter private int wpointAnt;

								@Getter @Setter private int wpointAct;

								@Getter @Setter private int wguarCar;

								@Getter @Setter private int wswCarDiv;

								@Getter @Setter private int wcntNumTro;

								@Getter @Setter private int wcntString01;

								@Getter @Setter private int wcntNcar;

						@Getter @Setter private char[] wresp = new char[50];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWCntString(0);
								setWEsp1(fillSpace(1));
								setWEsp2(fillSpace(2));
								setWPunto((".").toCharArray());
								setWAster(("*").toCharArray());
								setWnomPer01(fillSpace(22));
								setWpapPer01(fillSpace(22));
								setWsapPer01(fillSpace(22));
								setLlaTroParti(50);
								setNumCarParti(50);
								setWpointAnt(0);
								setWpointAct(0);
								setWguarCar(0);
								setWswCarDiv(0);
								setWcntNumTro(0);
								setWcntString01(0);
								setWcntNcar(0);
								setWresp(fillSpace(50));
    }





}
  
