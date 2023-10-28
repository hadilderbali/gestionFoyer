package com.example.hadilderbali4se4.entity;

import jakarta.persistence.GenerationType;

public @interface GenerateValue {
    GenerationType strategy();
}
