extern crate rand;

use std::io;
use rand::Rng;

fn main() {

    println!("Guess the number!");

    let secret_number =rand::thread_ring().gen_range(1, 101);
    println!("Please type in your guess?");
    let mut guess = String::new();
    io::stdin().read_line(&mut guess)
        .ok()
        .expect("Failed to read line");

    println!("You guessed {}", guess);
}
