package edu.ntut.project_01.homegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    @GetMapping("/index")
    public  String showIndex(){
        return "/index";
    }

    @GetMapping("/memberAreasIntroduction")
    public String showMemberAreasIntroduction(){
        return "/memberAreasIntroduction";
    }

    @GetMapping("/coachingAreasIntroduction")
    public String showCoachingAreasIntroduction(){
        return "/coachingAreasIntroduction";
    }

    @GetMapping("/shopping")
    public String showShopping(){
        return "/shopping";
    }

    @GetMapping("/shoppingCar")
    public String showShoppingCar(){
        return "/shoppingCar";
    }

    @GetMapping("/mycoursesAreasBuyedCourse")
    public String showMycoursesAreasBuyedCourse(){
        return "/mycoursesAreasBuyedCourse";
    }

    @GetMapping("/mycoursesAreasKeepCourse")
    public String showMycoursesAreasKeepCourse(){
        return "mycoursesAreasKeepCourse";
    }

    @GetMapping("/myFitnessPlan")
    public String showMyFitnessPlan(){
        return "myFitnessPlan";
    }

    @GetMapping("/fitnessPlan")
    public String showFitnessPlan(){
        return "fitnessPlan";
    }

    @GetMapping("/memberAreasMyOrderOk")
    public String showMemberAreasMyOrderOk() {
        return "memberAreasMyOrderOk";
    }

    @GetMapping("/memberAreasMyOrderNg")
    public String showMemberAreasMyOrderNg() {
        return "memberAreasMyOrderNg";
    }

    @GetMapping("/fitnesPlanPlayVideo")
    public String showFitnesPlanPlayVideo() {
        return "fitnesPlanPlayVideo";
    }

    @GetMapping("/shoppingCarCkeckout")
    public String showShoppingCarCkeckout() {
        return "shoppingCarCkeckout";
    }

    @GetMapping("/shoppingCarCheckoutSuccessful")
    public String showShoppingCarCheckoutSuccessful() {
        return "shoppingCarCheckoutSuccessful";
    }

    @GetMapping("/notPurchasedCourse")
    public String showNotPurchasedCourse() {
        return "notPurchasedCourse";
    }

    @GetMapping("/coachingAreasUploadedCourse")
    public String showCoachingAreasUploadedCourse() {
        return "coachingAreasUploadedCourse";
    }

    @GetMapping("/team")
    public String showTeam() {
        return "team";
    }
}
