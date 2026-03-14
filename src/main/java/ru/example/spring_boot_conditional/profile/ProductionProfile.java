package ru.example.spring_boot_conditional;


import ru.example.spring_boot_conditional.interfaces.SystemProfile;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}
