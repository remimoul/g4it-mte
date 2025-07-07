/*
 * G4IT
 * Copyright 2023 Sopra Steria
 *
 * This product includes software developed by
 * French Ecological Ministery (https://gitlab-forge.din.developpement-durable.gouv.fr/pub/numeco/m4g/numecoeval)
 */
import { RouterModule, Routes } from "@angular/router";
import { TitleResolver } from "../common/title-resolver.service";
import { InventoriesComponent } from "./inventories.component";

const routes: Routes = [
    {
        path: "",
        component: InventoriesComponent,
        resolve: {
            title: TitleResolver,
        },
        data: {
            titleKey: "inventories.page-title",
        },
    },
];

export const inventoriesRouter = RouterModule.forChild(routes);
