package fr.entrecode.poker_proba;

import java.util.HashMap;
import java.util.Map;

public class DictionnaireProbabilites {
	
	static Map<String, Map<Integer, Float>> dictionnaire = new HashMap<String, Map<Integer,Float>>();
	
	private DictionnaireProbabilites(){
		//                  id     2       3       4       5       6       7       8       9      10
		ajouterProbabilite("aa", 85.30f, 73.40f, 63.90f, 55.90f, 49.20f, 43.60f, 38.80f, 34.70f, 31.10f);
		ajouterProbabilite("kk", 82.40f, 68.90f, 58.20f, 49.80f, 43.00f, 37.50f, 32.90f, 29.20f, 26.10f);
		ajouterProbabilite("qq", 79.90f, 64.90f, 53.50f, 44.70f, 37.90f, 32.50f, 28.30f, 24.90f, 22.20f);
		ajouterProbabilite("jj", 77.50f, 61.20f, 49.20f, 40.30f, 33.60f, 28.50f, 24.60f, 21.60f, 19.30f);
		ajouterProbabilite("aks", 67.00f, 50.70f, 41.40f, 35.40f, 31.10f, 27.70f, 25.00f, 22.70f, 20.70f);
		ajouterProbabilite("1010", 75.10f, 57.70f, 45.20f, 36.40f, 30.00f, 25.30f, 21.80f, 19.20f, 17.20f);
		ajouterProbabilite("aqs", 66.10f, 49.40f, 39.90f, 33.70f, 29.40f, 26.00f, 23.30f, 21.10f, 19.30f);
		ajouterProbabilite("kqs", 63.40f, 47.10f, 38.20f, 32.50f, 28.30f, 25.10f, 22.50f, 20.40f, 18.60f);
		ajouterProbabilite("ak", 65.40f, 48.20f, 38.60f, 32.40f, 27.90f, 24.40f, 21.60f, 19.20f, 17.20f);
		ajouterProbabilite("ajs", 65.40f, 48.20f, 38.50f, 32.20f, 27.80f, 24.50f, 22.00f, 19.90f, 18.10f);
		ajouterProbabilite("kjs", 62.60f, 45.90f, 36.80f, 31.10f, 26.90f, 23.80f, 21.30f, 19.30f, 17.60f);
		ajouterProbabilite("a10s", 64.70f, 47.10f, 37.20f, 31.00f, 26.70f, 23.50f, 21.00f, 18.90f, 17.30f);
		ajouterProbabilite("99", 72.10f, 53.50f, 41.10f, 32.60f, 26.60f, 22.40f, 19.40f, 17.20f, 15.60f);
		ajouterProbabilite("qjs", 60.30f, 44.10f, 35.60f, 30.10f, 26.10f, 23.00f, 20.70f, 18.70f, 17.10f);
		ajouterProbabilite("aq", 64.50f, 46.80f, 36.90f, 30.40f, 25.90f, 22.50f, 19.70f, 17.50f, 15.50f);
		ajouterProbabilite("k10s", 61.90f, 44.90f, 35.70f, 29.90f, 25.80f, 22.80f, 20.40f, 18.50f, 16.90f);
		ajouterProbabilite("k10s", 61.90f, 44.90f, 35.70f, 29.90f, 25.80f, 22.80f, 20.40f, 18.50f, 16.90f);
		ajouterProbabilite("q10s", 59.50f, 43.10f, 34.60f, 29.10f, 25.20f, 22.30f, 19.90f, 18.10f, 16.60f);
		ajouterProbabilite("kq", 61.40f, 44.40f, 35.20f, 29.30f, 25.10f, 21.80f, 19.10f, 16.90f, 15.10f);
		ajouterProbabilite("j10s", 57.50f, 41.90f, 33.80f, 28.50f, 24.70f, 21.90f, 19.70f, 17.90f, 16.50f);
		ajouterProbabilite("aj", 63.60f, 45.60f, 35.40f, 28.90f, 24.40f, 21.00f, 18.30f, 16.10f, 14.30f);
		ajouterProbabilite("a9s", 63.00f, 44.80f, 34.60f, 28.40f, 24.20f, 21.10f, 18.80f, 16.90f, 15.40f);
		ajouterProbabilite("88", 69.10f, 49.90f, 37.50f, 29.40f, 24.00f, 20.30f, 17.70f, 15.80f, 14.40f);
		ajouterProbabilite("kj", 60.60f, 43.10f, 33.60f, 27.60f, 23.50f, 20.20f, 17.70f, 15.60f, 13.90f);
		ajouterProbabilite("a8s", 62.10f, 43.70f, 33.60f, 27.40f, 23.30f, 20.30f, 18.00f, 16.20f, 14.80f);
		ajouterProbabilite("k9s", 60.00f, 42.40f, 32.90f, 27.20f, 23.20f, 20.30f, 18.10f, 16.30f, 14.80f);
		ajouterProbabilite("a10", 62.90f, 44.40f, 34.10f, 27.60f, 23.10f, 19.80f, 17.20f, 15.10f, 13.40f);
		ajouterProbabilite("qj", 58.20f, 41.40f, 32.60f, 26.90f, 22.90f, 19.80f, 17.30f, 15.30f, 13.70f);
		ajouterProbabilite("a7s", 61.10f, 42.60f, 32.60f, 26.50f, 22.50f, 19.60f, 17.40f, 15.70f, 14.30f);
		ajouterProbabilite("q9s", 57.90f, 40.70f, 31.90f, 26.40f, 22.50f, 19.70f, 17.60f, 15.90f, 14.50f);
		ajouterProbabilite("109s", 54.30f, 38.90f, 31.00f, 26.00f, 22.50f, 19.80f, 17.80f, 16.20f, 14.90f);
		ajouterProbabilite("j9s", 55.80f, 39.60f, 31.30f, 26.10f, 22.40f, 19.70f, 17.60f, 15.90f, 14.60f);
		ajouterProbabilite("k10", 59.90f, 42.00f, 32.50f, 26.50f, 22.30f, 19.20f, 16.70f, 14.70f, 13.10f);
		ajouterProbabilite("a5s", 59.90f, 41.40f, 31.80f, 26.00f, 22.20f, 19.60f, 17.50f, 15.90f, 14.50f);
		ajouterProbabilite("77", 66.20f, 46.40f, 34.40f, 26.80f, 21.90f, 18.60f, 16.40f, 14.80f, 13.70f);
		ajouterProbabilite("a6s", 60.00f, 41.30f, 31.40f, 25.60f, 21.70f, 19.00f, 16.90f, 15.30f, 14.00f);
		ajouterProbabilite("a4s", 58.90f, 40.40f, 30.90f, 25.30f, 21.60f, 19.00f, 17.00f, 15.50f, 14.20f);
		ajouterProbabilite("q10", 57.40f, 40.20f, 31.30f, 25.70f, 21.60f, 18.60f, 16.30f, 14.40f, 12.90f);
		ajouterProbabilite("j10", 55.40f, 39.00f, 30.70f, 25.30f, 21.50f, 18.60f, 16.30f, 14.50f, 13.10f);
		ajouterProbabilite("k8s", 58.50f, 40.20f, 30.80f, 25.10f, 21.30f, 18.60f, 16.50f, 14.80f, 13.50f);
		ajouterProbabilite("a3s", 58.00f, 39.40f, 30.00f, 24.60f, 21.00f, 18.50f, 16.60f, 15.10f, 13.90f);
		ajouterProbabilite("k7s", 57.80f, 39.40f, 30.10f, 24.50f, 20.80f, 18.10f, 16.00f, 14.50f, 13.20f);
		ajouterProbabilite("q8s", 56.20f, 38.60f, 29.70f, 24.40f, 20.70f, 18.00f, 16.00f, 14.40f, 13.20f);
		ajouterProbabilite("108s", 52.60f, 36.90f, 29.00f, 24.00f, 20.60f, 18.10f, 16.20f, 14.80f, 13.60f);
		ajouterProbabilite("j8s", 54.20f, 37.50f, 29.10f, 24.00f, 20.50f, 17.90f, 15.90f, 14.40f, 13.20f);
		ajouterProbabilite("a2s", 57.00f, 38.50f, 29.20f, 23.90f, 20.40f, 18.00f, 16.10f, 14.60f, 13.40f);
		ajouterProbabilite("a9", 60.90f, 41.80f, 31.20f, 24.70f, 20.30f, 17.10f, 14.70f, 12.80f, 11.20f);
		ajouterProbabilite("98s", 51.10f, 36.00f, 28.50f, 23.60f, 20.20f, 17.80f, 15.90f, 14.50f, 13.40f);
		ajouterProbabilite("66", 63.30f, 43.20f, 31.50f, 24.50f, 20.10f, 17.30f, 15.40f, 14.00f, 13.10f);
		ajouterProbabilite("k6s", 56.80f, 38.40f, 29.10f, 23.70f, 20.10f, 17.50f, 15.60f, 14.00f, 12.80f);
		ajouterProbabilite("k5s", 55.80f, 37.40f, 28.20f, 23.00f, 19.50f, 17.00f, 15.20f, 13.70f, 12.50f);
		ajouterProbabilite("k9", 58.00f, 39.50f, 29.60f, 23.60f, 19.50f, 16.50f, 14.10f, 12.30f, 10.80f);
		ajouterProbabilite("a8", 60.10f, 40.80f, 30.10f, 23.70f, 19.40f, 16.20f, 13.90f, 12.00f, 10.60f);
		ajouterProbabilite("q7s", 54.50f, 36.70f, 27.90f, 22.70f, 19.20f, 16.70f, 14.80f, 13.30f, 12.10f);
		ajouterProbabilite("k4s", 54.70f, 36.40f, 27.40f, 22.30f, 19.00f, 16.60f, 14.80f, 13.40f, 12.30f);
		ajouterProbabilite("q9", 55.50f, 37.60f, 28.50f, 22.90f, 19.00f, 16.10f, 13.80f, 12.10f, 10.70f);
		ajouterProbabilite("107s", 51.00f, 34.90f, 27.00f, 22.20f, 19.00f, 16.60f, 14.80f, 13.50f, 12.40f);
		ajouterProbabilite("87s", 48.20f, 33.90f, 26.60f, 22.00f, 18.90f, 16.70f, 15.00f, 13.70f, 12.70f);
		ajouterProbabilite("97s", 49.50f, 34.20f, 26.80f, 22.10f, 18.90f, 16.60f, 14.90f, 13.60f, 12.50f);
		ajouterProbabilite("j7s", 52.40f, 35.40f, 27.10f, 22.20f, 18.90f, 16.40f, 14.60f, 13.20f, 12.00f);
		ajouterProbabilite("109", 51.70f, 35.70f, 27.70f, 22.50f, 18.90f, 16.20f, 14.10f, 12.60f, 11.30f);
		ajouterProbabilite("j9", 53.40f, 36.50f, 27.90f, 22.50f, 18.70f, 15.90f, 13.80f, 12.10f, 10.80f);
		ajouterProbabilite("55", 60.30f, 40.10f, 28.80f, 22.40f, 18.50f, 16.00f, 14.40f, 13.20f, 12.30f);
		ajouterProbabilite("q6s", 53.80f, 35.80f, 27.10f, 21.90f, 18.50f, 16.10f, 14.30f, 12.90f, 11.70f);
		ajouterProbabilite("a7", 59.10f, 39.40f, 28.90f, 22.60f, 18.40f, 15.40f, 13.20f, 11.40f, 10.10f);
		ajouterProbabilite("k3s", 53.80f, 35.50f, 26.70f, 21.70f, 18.40f, 16.20f, 14.50f, 13.10f, 12.10f);
		ajouterProbabilite("k2s", 52.90f, 34.60f, 26.00f, 21.20f, 18.10f, 15.90f, 14.30f, 13.00f, 11.90f);
		ajouterProbabilite("q5s", 52.90f, 34.90f, 26.30f, 21.40f, 18.10f, 15.80f, 14.10f, 12.70f, 11.60f);
		ajouterProbabilite("76s", 45.70f, 32.00f, 25.10f, 20.80f, 18.00f, 15.90f, 14.40f, 13.20f, 12.30f);
		ajouterProbabilite("a5", 57.70f, 38.20f, 27.90f, 22.00f, 18.00f, 15.20f, 13.10f, 11.50f, 10.10f);
		ajouterProbabilite("86s", 46.50f, 32.00f, 25.00f, 20.60f, 17.60f, 15.60f, 14.10f, 12.90f, 11.90f);
		ajouterProbabilite("q4s", 51.70f, 33.90f, 25.50f, 20.70f, 17.60f, 15.40f, 13.70f, 12.40f, 11.30f);
		ajouterProbabilite("a6", 57.80f, 38.00f, 27.60f, 21.50f, 17.50f, 14.70f, 12.60f, 10.90f, 9.60f);
		ajouterProbabilite("96s", 47.70f, 32.30f, 24.90f, 20.40f, 17.40f, 15.30f, 13.70f, 12.40f, 11.40f);
		ajouterProbabilite("j6s", 50.80f, 33.60f, 25.40f, 20.60f, 17.40f, 15.20f, 13.50f, 12.10f, 11.10f);
		ajouterProbabilite("k8", 56.30f, 37.20f, 27.30f, 21.40f, 17.40f, 14.60f, 12.50f, 10.80f, 9.40f);
		ajouterProbabilite("106s", 49.20f, 32.80f, 25.10f, 20.50f, 17.40f, 15.20f, 13.60f, 12.30f, 11.20f);
		ajouterProbabilite("44", 57.00f, 36.80f, 26.30f, 20.60f, 17.30f, 15.20f, 13.90f, 12.90f, 12.10f);
		ajouterProbabilite("a4", 56.40f, 36.90f, 26.90f, 21.10f, 17.30f, 14.70f, 12.60f, 11.00f, 9.80f);
		ajouterProbabilite("65s", 43.20f, 30.20f, 23.70f, 19.70f, 17.00f, 15.20f, 13.80f, 12.70f, 11.90f);
		ajouterProbabilite("j5s", 50.00f, 32.80f, 24.70f, 20.00f, 17.00f, 14.70f, 13.10f, 11.80f, 10.80f);
		ajouterProbabilite("q3s", 50.70f, 33.00f, 24.70f, 20.10f, 17.00f, 14.90f, 13.30f, 12.10f, 11.10f);
		ajouterProbabilite("q8", 53.80f, 35.40f, 26.20f, 20.60f, 16.90f, 14.10f, 12.10f, 10.50f, 9.20f);
		ajouterProbabilite("108", 50.00f, 33.60f, 25.40f, 20.40f, 16.90f, 14.40f, 12.50f, 11.00f, 9.90f);
		ajouterProbabilite("j8", 51.70f, 34.20f, 25.60f, 20.40f, 16.80f, 14.10f, 12.20f, 10.70f, 9.50f);
		ajouterProbabilite("75s", 43.80f, 30.10f, 23.40f, 19.40f, 16.70f, 14.80f, 13.40f, 12.30f, 11.40f);
		ajouterProbabilite("a3", 55.60f, 35.90f, 26.10f, 20.40f, 16.70f, 14.20f, 12.20f, 10.70f, 9.50f);
		ajouterProbabilite("k7", 55.40f, 36.10f, 26.30f, 20.50f, 16.70f, 13.90f, 11.80f, 10.20f, 9.00f);
		ajouterProbabilite("98", 48.40f, 32.90f, 25.10f, 20.10f, 16.60f, 14.20f, 12.30f, 10.90f, 9.90f);
		ajouterProbabilite("q2s", 49.90f, 32.20f, 24.00f, 19.50f, 16.60f, 14.60f, 13.10f, 11.90f, 10.90f);
		ajouterProbabilite("54s", 41.10f, 28.80f, 22.60f, 18.90f, 16.50f, 14.80f, 13.50f, 12.50f, 11.70f);
		ajouterProbabilite("j4s", 49.00f, 31.80f, 24.00f, 19.40f, 16.40f, 14.30f, 12.80f, 11.50f, 10.60f);
		ajouterProbabilite("85s", 44.80f, 30.20f, 23.20f, 19.10f, 16.30f, 14.30f, 12.90f, 11.80f, 10.90f);
		ajouterProbabilite("33", 53.70f, 33.50f, 23.90f, 19.00f, 16.20f, 14.60f, 13.50f, 12.60f, 12.00f);
		ajouterProbabilite("a2", 54.60f, 35.00f, 25.20f, 19.60f, 16.10f, 13.60f, 11.70f, 10.20f, 9.10f);
		ajouterProbabilite("95s", 45.90f, 30.40f, 23.20f, 18.80f, 16.00f, 13.90f, 12.40f, 11.30f, 10.30f);
		ajouterProbabilite("j3s", 47.90f, 30.90f, 23.20f, 18.80f, 16.00f, 14.00f, 12.50f, 11.30f, 10.40f);
		ajouterProbabilite("k6", 54.30f, 35.00f, 25.30f, 19.70f, 16.00f, 13.30f, 11.30f, 9.80f, 8.60f);
		ajouterProbabilite("105s", 47.20f, 30.80f, 23.30f, 18.90f, 16.00f, 13.90f, 12.40f, 11.20f, 10.20f);
		ajouterProbabilite("64s", 41.40f, 28.50f, 22.10f, 18.40f, 15.90f, 14.20f, 12.90f, 11.90f, 11.10f);
		ajouterProbabilite("j2s", 47.10f, 30.10f, 22.60f, 18.30f, 15.60f, 13.70f, 12.20f, 11.10f, 10.20f);
		ajouterProbabilite("104s", 46.40f, 30.10f, 22.70f, 18.40f, 15.60f, 13.60f, 12.10f, 11.00f, 10.00f);
		ajouterProbabilite("22", 50.30f, 30.70f, 22.00f, 17.80f, 15.50f, 14.20f, 13.30f, 12.50f, 12.00f);
		ajouterProbabilite("87", 45.50f, 30.60f, 23.20f, 18.50f, 15.40f, 13.10f, 11.50f, 10.30f, 9.30f);
		ajouterProbabilite("k5", 53.30f, 34.00f, 24.50f, 19.00f, 15.40f, 12.90f, 11.00f, 9.50f, 8.30f);
		ajouterProbabilite("74s", 41.80f, 28.20f, 21.70f, 17.90f, 15.30f, 13.50f, 12.20f, 11.20f, 10.40f);
		ajouterProbabilite("53s", 39.30f, 27.10f, 21.10f, 17.50f, 15.20f, 13.70f, 12.50f, 11.60f, 10.80f);
		ajouterProbabilite("97", 46.70f, 30.90f, 23.10f, 18.40f, 15.10f, 12.80f, 11.10f, 9.80f, 8.80f);
		ajouterProbabilite("q7", 51.90f, 33.20f, 24.00f, 18.60f, 15.10f, 12.50f, 10.60f, 9.20f, 8.00f);
		ajouterProbabilite("103s", 45.50f, 29.30f, 22.00f, 17.80f, 15.10f, 13.20f, 11.80f, 10.70f, 9.80f);
		ajouterProbabilite("107", 48.20f, 31.40f, 23.40f, 18.40f, 15.10f, 12.80f, 11.00f, 9.70f, 8.60f);
		ajouterProbabilite("j7", 49.90f, 32.10f, 23.50f, 18.30f, 14.90f, 12.40f, 10.60f, 9.20f, 8.10f);
		ajouterProbabilite("84s", 42.70f, 28.10f, 21.40f, 17.40f, 14.80f, 13.00f, 11.70f, 10.60f, 9.80f);
		ajouterProbabilite("102s", 44.70f, 28.50f, 21.40f, 17.40f, 14.80f, 13.00f, 11.60f, 10.50f, 9.70f);
		ajouterProbabilite("43s", 38.00f, 26.20f, 20.30f, 16.90f, 14.70f, 13.10f, 12.00f, 11.10f, 10.30f);
		ajouterProbabilite("k4", 52.10f, 32.80f, 23.40f, 18.10f, 14.70f, 12.30f, 10.50f, 9.10f, 8.00f);
		ajouterProbabilite("94s", 43.80f, 28.40f, 21.30f, 17.30f, 14.60f, 12.70f, 11.30f, 10.30f, 9.40f);
		ajouterProbabilite("63s", 39.40f, 26.50f, 20.40f, 16.80f, 14.50f, 12.90f, 11.70f, 10.80f, 10.00f);
		ajouterProbabilite("q6", 51.10f, 32.30f, 23.20f, 17.90f, 14.40f, 12.00f, 10.10f, 8.80f, 7.60f);
		ajouterProbabilite("93s", 43.20f, 27.80f, 20.80f, 16.80f, 14.30f, 12.50f, 11.10f, 10.10f, 9.20f);
		ajouterProbabilite("76", 42.70f, 28.50f, 21.50f, 17.10f, 14.20f, 12.20f, 10.80f, 9.60f, 8.80f);
		ajouterProbabilite("k3", 51.20f, 31.90f, 22.70f, 17.60f, 14.20f, 11.90f, 10.20f, 8.90f, 7.80f);
		ajouterProbabilite("52s", 37.50f, 25.30f, 19.50f, 16.10f, 14.00f, 12.50f, 11.40f, 10.60f, 9.80f);
		ajouterProbabilite("73s", 40.00f, 26.30f, 20.00f, 16.40f, 14.00f, 12.30f, 11.10f, 10.10f, 9.30f);
		ajouterProbabilite("86", 43.60f, 28.60f, 21.30f, 16.90f, 13.90f, 11.80f, 10.40f, 9.20f, 8.30f);
		ajouterProbabilite("92s", 42.30f, 27.00f, 20.20f, 16.40f, 13.90f, 12.20f, 10.90f, 9.90f, 9.10f);
		ajouterProbabilite("q5", 50.20f, 31.30f, 22.30f, 17.30f, 13.90f, 11.60f, 9.80f, 8.50f, 7.40f);
		ajouterProbabilite("42s", 36.30f, 24.60f, 18.80f, 15.70f, 13.70f, 12.30f, 11.20f, 10.40f, 9.60f);
		ajouterProbabilite("k2", 50.20f, 30.90f, 21.80f, 16.90f, 13.70f, 11.50f, 9.80f, 8.60f, 7.60f);
		ajouterProbabilite("83s", 40.80f, 26.30f, 19.80f, 16.00f, 13.60f, 11.90f, 10.70f, 9.70f, 8.90f);
		ajouterProbabilite("96", 44.90f, 28.80f, 21.20f, 16.60f, 13.50f, 11.40f, 9.80f, 8.70f, 7.80f);
		ajouterProbabilite("106", 46.30f, 29.20f, 21.20f, 16.50f, 13.40f, 11.20f, 9.50f, 8.30f, 7.30f);
		ajouterProbabilite("62s", 37.50f, 24.80f, 18.80f, 15.40f, 13.30f, 11.80f, 10.70f, 9.80f, 9.10f);
		ajouterProbabilite("65", 40.10f, 26.70f, 20.00f, 15.90f, 13.30f, 11.50f, 10.20f, 9.20f, 8.50f);
		ajouterProbabilite("82s", 40.30f, 25.80f, 19.40f, 15.70f, 13.30f, 11.70f, 10.50f, 9.60f, 8.80f);
		ajouterProbabilite("q4", 49.00f, 30.20f, 21.40f, 16.40f, 13.30f, 11.00f, 9.40f, 8.10f, 7.10f);
		ajouterProbabilite("j6", 47.90f, 29.80f, 21.40f, 16.50f, 13.20f, 11.00f, 9.30f, 8.00f, 7.00f);
		ajouterProbabilite("32s", 35.10f, 23.60f, 18.00f, 14.90f, 13.00f, 11.70f, 10.70f, 9.90f, 9.20f);
		ajouterProbabilite("72s", 38.10f, 24.50f, 18.40f, 15.00f, 12.80f, 11.20f, 10.10f, 9.20f, 8.50f);
		ajouterProbabilite("75", 40.80f, 26.50f, 19.70f, 15.50f, 12.80f, 11.00f, 9.70f, 8.70f, 7.90f);
		ajouterProbabilite("j5", 47.10f, 29.10f, 20.70f, 15.90f, 12.80f, 10.60f, 8.90f, 7.70f, 6.70f);
		ajouterProbabilite("q3", 47.90f, 29.20f, 20.70f, 15.90f, 12.80f, 10.70f, 9.10f, 7.90f, 6.90f);
		ajouterProbabilite("54", 37.90f, 25.20f, 18.80f, 15.00f, 12.60f, 11.00f, 9.80f, 8.90f, 8.20f);
		ajouterProbabilite("85", 41.70f, 26.50f, 19.40f, 15.20f, 12.40f, 10.50f, 9.10f, 8.10f, 7.30f);
		ajouterProbabilite("j4", 46.10f, 28.10f, 19.90f, 15.30f, 12.30f, 10.20f, 8.60f, 7.50f, 6.50f);
		ajouterProbabilite("q2", 47.00f, 28.40f, 19.90f, 15.30f, 12.30f, 10.30f, 8.80f, 7.70f, 6.80f);
		ajouterProbabilite("64", 38.00f, 24.70f, 18.20f, 14.40f, 12.00f, 10.30f, 9.20f, 8.30f, 7.60f);
		ajouterProbabilite("95", 42.90f, 26.70f, 19.20f, 14.80f, 12.00f, 10.00f, 8.50f, 7.40f, 6.60f);
		ajouterProbabilite("105", 44.20f, 27.10f, 19.30f, 14.80f, 11.90f, 9.90f, 8.40f, 7.20f, 6.40f);
		ajouterProbabilite("j3", 45.00f, 27.10f, 19.10f, 14.60f, 11.70f, 9.80f, 8.30f, 7.20f, 6.30f);
		ajouterProbabilite("104", 43.40f, 26.40f, 18.70f, 14.30f, 11.50f, 9.50f, 8.10f, 7.00f, 6.20f);
		ajouterProbabilite("53", 35.80f, 23.30f, 17.10f, 13.60f, 11.40f, 9.90f, 8.80f, 8.00f, 7.30f);
		ajouterProbabilite("74", 38.60f, 24.50f, 17.90f, 13.90f, 11.40f, 9.70f, 8.50f, 7.60f, 6.80f);
		ajouterProbabilite("j2", 44.00f, 26.20f, 18.40f, 14.10f, 11.30f, 9.40f, 8.00f, 7.00f, 6.20f);
		ajouterProbabilite("103", 42.40f, 25.50f, 18.00f, 13.70f, 11.00f, 9.10f, 7.80f, 6.80f, 6.00f);
		ajouterProbabilite("84", 39.60f, 24.40f, 17.50f, 13.40f, 10.80f, 9.00f, 7.80f, 6.80f, 6.10f);
		ajouterProbabilite("43", 34.40f, 22.30f, 16.30f, 12.80f, 10.70f, 9.30f, 8.30f, 7.50f, 6.80f);
		ajouterProbabilite("63", 35.90f, 22.70f, 16.40f, 12.80f, 10.60f, 9.10f, 8.00f, 7.20f, 6.50f);
		ajouterProbabilite("102", 41.50f, 24.70f, 17.30f, 13.20f, 10.60f, 8.80f, 7.50f, 6.60f, 5.80f);
		ajouterProbabilite("94", 40.70f, 24.60f, 17.30f, 13.20f, 10.50f, 8.70f, 7.30f, 6.40f, 5.60f);
		ajouterProbabilite("93", 39.90f, 23.90f, 16.70f, 12.70f, 10.10f, 8.30f, 7.10f, 6.10f, 5.40f);
		ajouterProbabilite("52", 33.90f, 21.30f, 15.30f, 12.00f, 10.00f, 8.60f, 7.60f, 6.80f, 6.20f);
		ajouterProbabilite("73", 36.60f, 22.40f, 16.00f, 12.30f, 9.90f, 8.40f, 7.20f, 6.40f, 5.70f);
		ajouterProbabilite("92", 38.90f, 22.90f, 16.00f, 12.10f, 9.60f, 8.00f, 6.80f, 5.90f, 5.20f);
		ajouterProbabilite("42", 32.50f, 20.50f, 14.70f, 11.50f, 9.50f, 8.30f, 7.30f, 6.60f, 6.00f);
		ajouterProbabilite("83", 37.50f, 22.40f, 15.70f, 11.90f, 9.50f, 7.90f, 6.70f, 5.80f, 5.10f);
		ajouterProbabilite("62", 34.00f, 20.70f, 14.60f, 11.20f, 9.10f, 7.80f, 6.80f, 6.00f, 5.40f);
		ajouterProbabilite("82", 36.80f, 21.70f, 15.10f, 11.40f, 9.10f, 7.50f, 6.40f, 5.60f, 4.90f);
		ajouterProbabilite("32", 31.20f, 19.50f, 13.90f, 10.80f, 8.90f, 7.70f, 6.80f, 6.10f, 5.60f);
		ajouterProbabilite("72", 34.60f, 20.40f, 14.20f, 10.70f, 8.60f, 7.20f, 6.10f, 5.40f, 4.80f);
	}
	
	private static DictionnaireProbabilites instance = new DictionnaireProbabilites(); 
	
	public static DictionnaireProbabilites getInstance() {
		return instance;
	}
	
	private void ajouterProbabilite(String identifiant, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10) {
		if(!dictionnaire.containsKey(identifiant)) {
			Map<Integer, Float> probabilites = new HashMap<Integer, Float>();
			probabilites.put(2, p2);
			probabilites.put(3, p3);
			probabilites.put(4, p4);
			probabilites.put(5, p5);
			probabilites.put(6, p6);
			probabilites.put(7, p7);
			probabilites.put(8, p8);
			probabilites.put(9, p9);
			probabilites.put(10, p10);
			dictionnaire.put(identifiant, probabilites);
		}
	}
	
	public static float getProbabilite(String identifiant, Integer nombreJoueurs) {
		float probabilite = -1f;
		if (dictionnaire.containsKey(identifiant)) {
			if(dictionnaire.get(identifiant).containsKey(nombreJoueurs)) {
				probabilite = dictionnaire.get(identifiant).get(nombreJoueurs);
			}
		}
		return probabilite;
	}
}
