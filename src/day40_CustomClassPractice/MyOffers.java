package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setOfferInfo(100000, "VA", true, true, true, "SDET", true);
        offer1.getOfferInfo();
        offer2.setOfferInfo(175000, "VA", true, true, false, "SDET", true);
        offer3.setOfferInfo(125000, "VA", true , true, true, "SDET", true);
        offer4.setOfferInfo(130000, "PA", true, false, false, "QA", true);
        offer5.setOfferInfo(100000, "CA", true, false, false, "QA", true);
        offer6.setOfferInfo(120000, "CO", true, true, true, "Senior SDET", false);
        offer7.setOfferInfo(110000, "GA",true, false, false, "QA", true );

        ArrayList<Offer> jobOffers = new ArrayList<>();
        jobOffers.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));

        for(Offer eachOffer: jobOffers){
            eachOffer.getOfferInfo();
        }

        System.out.println("============================");
        // less than 120000
        // jobOffers.removeIf(p -> p.salary < 120000);
        // System.out.println("Number of job offers: " + jobOffers.size());

        // less than 120000 or not from VA area
        // jobOffers.removeIf(p -> p.salary < 120000 || !p.state.equals("VA"));
        // System.out.println("Number of job offers: " + jobOffers.size());

        // remove if offer does not PTO, or benefit, or full time position
        jobOffers.removeIf(p -> p.hasPTO == false || p.hasBenefits == false || p.isFullTime == false);
        System.out.println("Number of job offers: " + jobOffers.size());


    }
}