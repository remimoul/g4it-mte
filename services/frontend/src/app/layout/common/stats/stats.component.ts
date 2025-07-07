/*
 * G4IT
 * Copyright 2023 Sopra Steria
 *
 * This product includes software developed by
 * French Ecological Ministery (https://gitlab-forge.din.developpement-durable.gouv.fr/pub/numeco/m4g/numecoeval)
 */
import { Component, Input } from "@angular/core";
import { Stat } from "src/app/core/interfaces/footprint.interface";

@Component({
    selector: "app-stats",
    templateUrl: "./stats.component.html",
})
export class StatsComponent {
    @Input() stats: Stat[] = [];
    @Input() icon: string = "";
    @Input() title: string = "";
}
